/**
 * 	Problem statement - Write a program connect with MySQL database and fetch the record from table
 */
package com.sid.database_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Siddhant Patni
 *
 */
public class MySQLConnection 
{
	public static void main(String args[])
	{  
		try
		{  
			// Add MySQL connector jar into build path of project
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sid","root","root");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employee");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}