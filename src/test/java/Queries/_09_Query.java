package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _09_Query extends DBUtility {
    @Test
    public void Query09() {
        String sorguSql = "Select d.dept_name ,AVG(s.salary) FROM employees e JOIN dept_emp de ON e.emp_no = de.emp_no JOIN departments d ON de.dept_no = d.dept_no\n" +
                "JOIN salaries s ON e.emp_no = s.emp_no GROUP BY d.dept_name;";

        ArrayList<ArrayList<String>> returnedData = getListData(sorguSql);


        for (ArrayList<String> row : returnedData) {
            System.out.println("Departman: " + row.get(0) + " | Ortalama Maaş: " + row.get(1));
        }
    }
}
