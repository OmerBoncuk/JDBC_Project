package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _14_Query extends DBUtility {

    @Test
    public void Query14(){

        String sorguSql="SELECT employees.first_name, employees.last_name, salaries.salary\n" +
                "FROM employees, salaries, departments, dept_emp\n" +
                "WHERE employees.emp_no = dept_emp.emp_no\n" +
                "  AND dept_emp.dept_no = departments.dept_no\n" +
                "  AND employees.emp_no = salaries.emp_no\n" +
                "  AND departments.dept_name = 'Sales'\n" +
                "ORDER BY salaries.salary DESC\n" +
                "limit 1;";

        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }

}
