package Queries;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static JDBC_Utility.DBUtility.getListData;

public class _19_Query {

    @Test
    public void Query19 () {

        String sorguSql = "select e.first_name, e.last_name, e.hire_date\n" +
                "from employees e\n" +
                "where hire_date between '1985-01-01' AND '1989-12-31'\n" +
                "order by hire_date desc;";

        ArrayList <ArrayList<String>> donenData = getListData(sorguSql);

        for(ArrayList<String> row : donenData) {
            for (String column : row)
                System.out.print(column + "\t");

            System.out.println();
        }
    }
}
