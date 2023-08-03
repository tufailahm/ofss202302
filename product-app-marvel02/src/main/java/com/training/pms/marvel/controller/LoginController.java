package com.training.pms.marvel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String un = request.getParameter("username");		//Tarun
		String pass = request.getParameter("password");
		
		Cookie allCookie[] = request.getCookies();
		boolean visited = false;
		for(Cookie c:allCookie)
		{
				if(c.getName().equals(un))
				{
						visited = true;
						break;
				}
		}
		if(visited) {
			pw.println("You already visited our website. ");

		}
		else
		{
			pw.println("You have visited our website for the first time");
			Cookie cookie = new Cookie(un, un);			//Tarun	- Tarun
			response.addCookie(cookie);
			
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("usern", un);
		
		
		//code to check the validity of the user
		//we are assuming the valid user
		//pw.print("Your password is :"+pass);
		//pw.print("<br/><br/><br/><a href=DashboardController>Dashboard</a>");
		if(un.startsWith("T"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("DashboardController");
			rd.include(request, 	response);
		}
		else if(un.equalsIgnoreCase("utkarsh"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("AdminDashboardController");
			rd.include(request, response);
		}
		else {
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
