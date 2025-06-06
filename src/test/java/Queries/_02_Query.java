package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _02_Query extends DBUtility {

    @Test
    public void Query02(){

        String sorguSql="select * from departments,employees \n" +
                "where dept_name='Human Resources';";

        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }

}
