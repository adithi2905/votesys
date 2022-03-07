package com.votingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
public class Db{
	public static Connection createdb() throws ClassNotFoundException, SQLException
	{
		//String party=req.getParameter("Parties");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DAB1","root","9514067534");
	Statement st=con.createStatement();
	return con;	
	
	}
}
