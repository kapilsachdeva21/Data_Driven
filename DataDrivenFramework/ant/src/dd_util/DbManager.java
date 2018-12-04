package dd_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DbManager
{

	private static Connection conn = null;



	public static void setMysqlDbConnection() throws SQLException, ClassNotFoundException
    {
    try
    {

        Class.forName (TestConfig.mysqldriver).newInstance ();
        conn = DriverManager.getConnection (TestConfig.mysqlurl, TestConfig.mysqluserName, TestConfig.mysqlpassword);
        if(!conn.isClosed())
			System.out.println("Successfully connected to MySQL server");


    }
    catch (Exception e)
    {
        System.err.println ("Cannot connect to database server");

       // monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject+" - (Script failed with Error, Datamart database used for reports, connection not established)", TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
    }


}







	public static  void getMysqlQuery(String query) throws SQLException{


		Statement St = conn.createStatement();
		ResultSet rs = St.executeQuery(query);
		//List<String> values1 = new ArrayList<String>();
		while(rs.next()){

		   rs.getString(1);
		   rs.getString(2);
		   rs.getString(3);
		   rs.getString(4);
		   System.out.println( rs.getString(1) + "\t" +  rs.getString(2) + "\t" +  rs.getString(3) +"\t" +  rs.getString(4));

			//values1.add(rs.getString(1));


		}
		//return values1;
	}








	public static Connection getConnection()
	{
		return conn;
			}
}
