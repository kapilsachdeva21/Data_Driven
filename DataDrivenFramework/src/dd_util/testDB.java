package dd_util;

import java.sql.SQLException;

public class testDB
{

   public static void main(String[] args) throws ClassNotFoundException, SQLException
   {
      DbManager.setMysqlDbConnection();
      DbManager.getMysqlQuery("select * from emp");

   }

}
