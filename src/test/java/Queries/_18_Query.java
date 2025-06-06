package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _18_Query extends DBUtility {

    @Test
    public void query12Test(){

        String SQLQuery = "select first_name, last_name, hire_date from employees " +
                "where hire_date < '1990-01-01' \n" +
                "order by hire_date desc LIMIT 250";

        // Info: Because the list is long, it is limited to the first 250 employees.

        ArrayList<ArrayList<String>> data = getListData(SQLQuery);

        for (ArrayList<String> row : data){
            for (String cell : row)
                System.out.print(cell + "\t");
        }
    }
}
