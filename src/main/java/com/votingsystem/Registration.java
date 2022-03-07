package com.votingsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/reg")
public class Registration extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name=(String)req.getParameter("name");
		System.out.print(name);
		int id=Integer.parseInt(req.getParameter("voterid"));
		Connection con;
		try {
			
			con = Db.createdb();
			String sql="INSERT INTO DAB1.VOTING(VoterID,Voter,Partyname) VALUES(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1,id);
			
				// TODO Auto-generated catch block
				ps.setString(2,name);
				ps.setString(3,"party");
				ps.executeUpdate();
				ps.close();
				con.close();
				HttpSession session =req.getSession();
				session.setAttribute("id", id);
				res.sendRedirect("vote.jsp");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e instanceof SQLIntegrityConstraintViolationException)
			{
				res.sendRedirect("vote.jsp");
				
			}
		}
		
	}
	
	

}
