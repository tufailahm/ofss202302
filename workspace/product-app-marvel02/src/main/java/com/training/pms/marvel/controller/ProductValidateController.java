package com.training.pms.marvel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductValidateController
 */
public class ProductValidateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductValidateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		// String pid = request.getParameter("productId");
		// String pname = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		
		if(quantityOnHand<0)
		{
			pw.println("<h1>Negative Quantity Entered!!!</h1>");
			pw.println("<br/><a href = product.html>Try Again</a>");
		}
		else if(price<0)
		{
			pw.println("<h1>Negative Price Entered!!!</h1>");
			pw.println("<br/><a href = product.html>Try Again</a>");
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("ProductController");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
