package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _21_Query_C extends DBUtility {

    @Test
    public void Query21_C()
    {
        String sorguSql= "select gender, count(*) as sayi\n" +
        "from employees\n" +
        "group by gender;";

        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }



}
