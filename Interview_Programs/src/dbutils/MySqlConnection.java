package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.jdbc.Driver");//Class forName
		// variables
	      final String url = "jdbc:mysql://localost:3307/aliens";
	      final String user = "root";
	      final String password = "";

	      // establish the connection
	      //Connection is interface,DriverManager which implement Instance connection,getConnection is static method in DriverManager

	      Connection con = DriverManager.getConnection(url, user, password);
	      // create JDBC statement object
	      Statement st = con.createStatement();

	      // prepare SQL query
	      String query = "SELECT username from student where userid=3";

	      // send and execute SQL query in Database software
	      ResultSet rs = st.executeQuery(query);

	      // process the ResultSet object
	      boolean flag = false;
	      while (rs.next()) {
	         flag = true;
	         System.out.println(rs.getString("username"));
	      }

	      if (flag == true) {
	         System.out.println("\nRecords retrieved and displayed");
	      } else {
	         System.out.println("Record not found");
	      }

	      // close JDBC objects
	      rs.close();
	      st.close();
	      con.close();

	   } 
	}