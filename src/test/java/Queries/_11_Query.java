package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _11_Query extends DBUtility {

    @Test
    public void Query11()
    {
        String sorguSql= "select emp_no, salary, from_date, to_date\n" +
        "from salaries\n" +
        "where emp_no = 10102\n" +
        "order by from_date;";


        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        for(ArrayList<String> satir : donenData) {
            for (String kolonItem : satir)
                System.out.print(kolonItem + "\t");

            System.out.println();
        }

    }



}
