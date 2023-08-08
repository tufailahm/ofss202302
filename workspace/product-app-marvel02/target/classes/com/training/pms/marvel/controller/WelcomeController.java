package com.training.pms.marvel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeController
 */
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     int visitorCount =0; 
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
		visitorCount++;
		response.setContentType("text/	html");
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1>Hello , Guest OFSS</h1>");
		response.getWriter().println("<h1>You are visitor number : "+visitorCount+ "</h1>");
		response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
