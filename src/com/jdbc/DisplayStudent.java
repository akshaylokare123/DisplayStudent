package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudent 
{
	public static void main(String[] args)
	{
		try 
		{
			Connection con=ConnectionProvider.createC();
			
			String q="select * from student";
			
			Statement stmt=con.createStatement();
			
			ResultSet rst=stmt.executeQuery(q);
			
			while(rst.next())
			{
				int id=rst.getInt(1);
				String name=rst.getString(2);
				String phone=rst.getString(3);
				String city=rst.getString(4);
				
				System.out.println(id+" : "+name + " : " +phone+ " : " +city);
			}
						
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
