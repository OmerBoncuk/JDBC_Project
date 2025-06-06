package Queries;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static JDBC_Utility.DBUtility.getListData;

public class _13_Query {

    @Test
    public void Query13 () {

        String sorguSql = "SELECT e.emp_no, e.first_name, e.last_name, s.salary, s.from_date\n" +
                "FROM employees e\n" +
                "JOIN (\n" +
                "    SELECT emp_no, MAX(from_date) AS latest_date\n" +
                "    FROM salaries\n" +
                "    GROUP BY emp_no\n" +
                ") AS latest_s ON e.emp_no = latest_s.emp_no\n" +
                "JOIN salaries s ON s.emp_no = latest_s.emp_no AND s.from_date = latest_s.latest_date;";

        ArrayList <ArrayList<String>> donenData = getListData(sorguSql);

        for(ArrayList<String> row : donenData) {
            for (String column : row)
                System.out.print(column + "\t");

            System.out.println();
        }
    }
}
