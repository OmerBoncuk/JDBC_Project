package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class _03_Query extends DBUtility {

    @Test
    public void Query03() {
        String sorguSql = "select avg(salary)  from salaries;";

        ArrayList<ArrayList<String>> returnedData = getListData(sorguSql);


        for (ArrayList<String> row : returnedData) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println("Ortalama Maas"); System.out.println("");
        }
    }
}