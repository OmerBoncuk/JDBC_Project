package Queries;


import org.testng.annotations.Test;

import java.util.ArrayList;

import static JDBC_Utility.DBUtility.getListData;

public class _01_Query {

    @Test
    public void Query01 () { 

        String sorguSql = "select * from employees;";

        ArrayList <ArrayList<String>> donenData = getListData(sorguSql);

        for(ArrayList<String> row : donenData) {
            for (String column : row)
                System.out.print(column + "\t");

            System.out.println();
        }
    }

}
