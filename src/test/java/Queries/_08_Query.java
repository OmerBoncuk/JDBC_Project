package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _08_Query extends DBUtility {

    @Test
    public void Query08(){

        String sorguSql="SELECT departments.dept_name, AVG(salaries.salary) AS average_salary\n" +
                "FROM employees, departments, dept_emp, salaries\n" +
                "WHERE employees.emp_no = dept_emp.emp_no\n" +
                "  AND departments.dept_no = dept_emp.dept_no\n" +
                "  AND employees.emp_no = salaries.emp_no\n" +
                "GROUP BY departments.dept_name;";

        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }
    }

}
