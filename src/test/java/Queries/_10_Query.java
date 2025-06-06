package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _10_Query extends DBUtility {

    @Test
    public void Query10() {

        String sorguSql = "select salaries.* from salaries\n" + "where emp_no=10102";

        ArrayList<ArrayList<String>> returnedData = getListData(sorguSql);

        for (ArrayList<String> satir : returnedData) {
            for (String kolon : satir) {
                System.out.print(kolon + "\t");
            }
            System.out.println();
        }
    }
}
