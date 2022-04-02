package main;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	static Connection connection;
	
	final static String subProtocol="mysql";
	final static String host="//localhost";
	final static String port="3306"; 
	final static String database="dms";
	final static String username="root";
	final static String password="";
	
	public static Connection getConnection() throws SQLException {
		if (connection==null||connection.isClosed()) {
			connection= DriverManager.getConnection("jdbc:"+subProtocol+":"+host+":"+port+"/"+database,username,password);
		}
		return connection;
	}
	
	public static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
	}
}
