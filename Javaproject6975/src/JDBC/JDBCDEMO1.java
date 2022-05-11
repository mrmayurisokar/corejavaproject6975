package JDBC;

import java.sql.*;

public class JDBCDEMO1 {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql:///demodb","root","mayur@12#");
			Statement stmt = con.createStatement();
			String query = "create table list(id int, name varchar(20))";

			stmt.executeUpdate(query);

		}

		catch(Exception e)
		{
		System.out.println("Exception has occured "+e);
		}
	
	}

}
