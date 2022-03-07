package com.votingsystem;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/voting")
public class Votingsys extends HttpServlet {
	public void service(HttpServletRequest re,HttpServletResponse resp) throws IOException
	{
		
		String party=re.getParameter("Parties");
		parties p=new parties(party);
		HttpSession sess=re.getSession();
		sess.setAttribute("party",party);
		resp.sendRedirect("vote");
		
	}
	
		

}