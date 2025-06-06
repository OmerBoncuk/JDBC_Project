package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class _06_Query extends DBUtility {

    @Test
    public void query6Test() {

        String SQLQuery = "select dept_emp.emp_no, employees.first_name, last_name, salaries.salary " +
                "from dept_emp \n" +
                "left JOIN salaries ON dept_emp.emp_no = salaries.emp_no\n" +
                "left JOIN employees ON dept_emp.emp_no = employees.emp_no \n" +
                "where dept_no like '%d007%' and salaries.salary > 70000 order by salary asc LIMIT 250;";

        // Info: Because the list is long, it is limited to the first 250 employees.

        ArrayList<ArrayList<String>> data = getListData(SQLQuery);

        System.out.println("List of all employees in the 'Sales' department" + "\n" +
                            "with a salary of more than 70,000 :");

        System.out.println("----------------------------------------------");

        for (ArrayList<String> row : data){
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
        System.out.println();
        }
    }
}
