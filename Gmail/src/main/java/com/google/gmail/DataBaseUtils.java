package com.google.gmail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils {

	@Test
	public void getExecuteQuery() throws SQLException
	{
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root", "root");
		Statement stat=con.createStatement();
		
		ResultSet result=stat.executeQuery("Select * from customer;");
		
		while(result.next())
		{
			System.out.println(result.getString(2));
		}
		con.close();
	}
}
