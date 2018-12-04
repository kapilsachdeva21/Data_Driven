package dd_util;

import java.sql.SQLException;

public class TestDBQuery
{

   public static void main(String[] args) throws SQLException
   {
      DbManager.getConnection();
      DbManager.getMysqlQuery("select * from actor");

   }

}
