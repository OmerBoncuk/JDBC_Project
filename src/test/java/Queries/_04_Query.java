package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _04_Query extends DBUtility {

    @Test
    public void Query04() {

        String sorguSql = "select avg(salary) as AverageSalary, employees.*  from employees\n" +
                "left join salaries on employees.emp_no=salaries.emp_no\n" +
                "where gender='M'\n" +
                "group by employees.emp_no\n" +
                "order by first_name";

        ArrayList<ArrayList<String>> returnedData = getListData(sorguSql);

        for (ArrayList<String> satir : returnedData) {
            for (String kolon : satir) {
                System.out.print(kolon + "\t");
            }
            System.out.println();
        }
    }
}
