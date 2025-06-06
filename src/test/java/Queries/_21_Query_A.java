package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _21_Query_A extends DBUtility {

    @Test
    public void Query21()
    {
        String sorguSql= "select count(*) as erkek_sayisi\n" +
        "from employees\n" +
        "where gender = 'M';";


        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }



}
