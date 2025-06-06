package Queries;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static JDBC_Utility.DBUtility.getListData;

public class _07_Query {
    @Test
    public void Query07() {

        String sorguSql = "SELECT e.emp_no, e.first_name, e.last_name, s.salary\n" +
                "FROM employees e\n" +
                "LEFT JOIN salaries s ON e.emp_no = s.emp_no\n" +
                "WHERE s.salary BETWEEN 50000 AND 100000;";

        ArrayList <ArrayList<String>> donenData = getListData(sorguSql);

        for(ArrayList<String> row : donenData) {
            for (String column : row)
                System.out.print(column + "\t");

            System.out.println();
        }
    }
}
