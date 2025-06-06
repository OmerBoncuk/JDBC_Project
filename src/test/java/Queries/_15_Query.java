package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _15_Query extends DBUtility {
    @Test
    public void Query09() {
        String sorguSql = " SELECT e.emp_no,e.first_name,e.last_name,d.dept_name,s.salary FROM employees e JOIN dept_emp de ON e.emp_no = de.emp_no JOIN departments d ON de.dept_no = d.dept_no\n" +
                "JOIN salaries s ON e.emp_no = s.emp_no WHERE d.dept_name = 'Research' ORDER BY s.salary DESC LIMIT 1;";
        ArrayList<ArrayList<String>> returnedData = getListData(sorguSql);

        for (ArrayList<String> row : returnedData) {
            System.out.println("Çalışan Bilgisi:");
            System.out.println(" - No: " + row.get(0));
            System.out.println(" - Ad: " + row.get(1));
            System.out.println(" - Soyad: " + row.get(2));
            System.out.println(" - Departman: " + row.get(3));
            System.out.println(" - Maaş: " + row.get(4));

        }

    }
}
