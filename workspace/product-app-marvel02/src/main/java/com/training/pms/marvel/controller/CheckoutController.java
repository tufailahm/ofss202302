package com.training.pms.marvel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.pms.marvel.model.Product;

/**
 * Servlet implementation class CheckoutController
 */
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("usern");
		Product product = (Product) session.getAttribute("productData");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("<h2>Thanks Mr/Ms. "+username + " for shopping with us<h2><br/><br/>");
		pw.print("<h2>Your product :"+product.getProductName()+ " will get delivered to you </h2>");
		pw.println("<h2>Here is the product details : "+product+"</h2>");
		
		
		pw.println("<br/><br/><br/><a href=bill.jsp>Your bill</a>");
		
		pw.println("<br/><br/><br/><a href=index.jsp>Home</a>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
