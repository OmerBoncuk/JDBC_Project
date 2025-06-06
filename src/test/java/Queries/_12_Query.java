package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _12_Query extends DBUtility {

    @Test
    public void query12Test(){

        String SQLQuery = "select employees.emp_no, first_name, last_name, salaries.salary " +
                "from  employees left JOIN salaries ON employees.emp_no = salaries.emp_no\n" +
                "where salaries.salary = (select max(salary) from salaries)";

        ArrayList<ArrayList<String>> data = getListData(SQLQuery);

        System.out.println("The employee with the highest salary :");

        System.out.println("-------------------------------------");

        for (ArrayList<String> row : data){
            for (String cell : row)
                System.out.print(cell + "\t");
        }
    }
}
