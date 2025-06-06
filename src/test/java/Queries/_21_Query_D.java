package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _21_Query_D extends DBUtility {

    @Test
    public void Query2_D()
    {
        String sorguSql= "select count(*) as toplam_calisan\n" +
        "from employees;";

        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }



}
