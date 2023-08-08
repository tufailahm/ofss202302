package com.training.pms.marvel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeController
 */

public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     int visitorCount; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie allCookie[] = request.getCookies();
		for(Cookie c:allCookie)
		{
				if(c.getName().equals("hitCounter"))
				{
						int temp = Integer.parseInt(c.getValue());			//19171
						visitorCount = temp + 1;
						break;
				}
				else
				{
					visitorCount = 1;
				}
		}
		response.setContentType("text/html");
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1>Hello , Guest OFSS</h1>");
		response.getWriter().println("<h1>You are visitor number : "+visitorCount+ "</h1>");
		response.getWriter().println("<a href=print>PrintName</a>");
		response.getWriter().println("</body></html>");
		Cookie newCookie = new Cookie("hitCounter",String.valueOf(visitorCount));
		response.addCookie(newCookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
