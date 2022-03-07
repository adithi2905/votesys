package com.votingsystem;

import java.sql.*;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/vote")
public class Votesave extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession ses=req.getSession();
		String name=(String)ses.getAttribute("party");
		//System.out.print(name);
		try {
			
			Connection con = Db.createdb();
			
			String sql="Update DAB1.VOTING set Partyname=? where Partyname='party'";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1,name);
			st.executeUpdate();
			st.close();
			con.close();
			
		}
		catch(Exception ex)
		{
			System.out.print(ex);
		}
	}
	

}
