package np.com.lwang.bookstore.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] argv) throws Exception {
	    String driver = "com.mysql.jdbc.Driver";
	    String connection = "jdbc:mysql://localhost:3307/bookstore";
	    String user = "root";
	    String password = "root";
	    Class.forName(driver);
	    Connection con = DriverManager.getConnection(connection, user, password);
	    System.out.println(con == null);
	    Statement stat = con.createStatement();
	    ResultSet rs = stat.executeQuery("select * from book");
	    //System.out.print(rs.getString(1));
	    if (!con.isClosed()) {
	      con.close();
	    }
	  }

}
