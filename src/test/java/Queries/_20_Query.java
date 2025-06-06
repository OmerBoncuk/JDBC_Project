package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _20_Query extends DBUtility {

    @Test
    public void Query02(){

        String sorguSql="SELECT employees.first_name, employees.last_name, employees.hire_date, salaries.salary\n" +
                "FROM employees, salaries, departments, dept_emp\n" +
                "WHERE employees.emp_no = dept_emp.emp_no\n" +
                "  AND dept_emp.dept_no = departments.dept_no\n" +
                "  AND employees.emp_no = salaries.emp_no\n" +
                "  AND departments.dept_name = 'Sales'\n" +
                "  AND employees.hire_date BETWEEN '1985-01-01' AND '1989-12-31'\n" +
                "ORDER BY salaries.salary DESC;";

        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }

}
