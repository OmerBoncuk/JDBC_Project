package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _16_Query extends DBUtility {

    @Test
    public void Query16() {

        String sorguSql = "select e.first_name,e.last_name,s.*, d.dept_name\n" +
                "from salaries s \n" +
                "JOIN (\n" +
                "    SELECT emp_no, MAX(salary) AS max_salary\n" +
                "    FROM salaries\n" +
                "    GROUP BY emp_no\n" +
                ") AS max_s ON s.emp_no = max_s.emp_no AND s.salary = max_s.max_salary\n" +
                "JOIN dept_emp de on s.emp_no = de.emp_no\n" +
                "JOIN employees e on s.emp_no = e.emp_no\n" +
                "JOIN departments d on de.dept_no = d.dept_no\n" +
                "order by s.salary desc\n" +
                "limit 5000";     // When no limit is set, the entire list cannot be displayed on the screen (331656).

        ArrayList<ArrayList<String>> returnedData = getListData(sorguSql);

        for (ArrayList<String> satir : returnedData) {
            for (String kolon : satir) {
                System.out.print(kolon + "\t");
            }
            System.out.println();
        }
    }
}
