package Queries;

import JDBC_Utility.DBUtility;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class _05_Query extends DBUtility {

  @Test
  public void Query05()
  {
      String sorguSql= "select avg(salaries.salary) as Average_salarys\n" +
      "from employees\n" +
      "join salaries ON employees.emp_no = salaries.emp_no\n" +
      "where employees.gender = 'F';";


      ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

      for(ArrayList<String> satir : donenData) {
          for (String kolonItem : satir)
              System.out.print(kolonItem + "\t");

          System.out.println();
      }

  }



}
