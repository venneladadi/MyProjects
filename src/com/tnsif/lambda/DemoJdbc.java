package com.tnsif.lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
		try
		{
			//load the driver
			DemoJdbc.forName("com.mysql.jdbcDriver");
			//establish the connection
			Connection con=DriverManager.getConnection("jdbc.mysql://localhost:3306/viit","root","root");
			//create statement
			Statement st=con.createStatement();
			//process the result
			ResultSet rs=st.executeQuery("Select*from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				st.close();
				con.close();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void forName(String string) {
		// TODO Auto-generated method stub
		
	}

}
