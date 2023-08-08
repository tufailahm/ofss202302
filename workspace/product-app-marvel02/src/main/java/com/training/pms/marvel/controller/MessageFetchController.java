package com.training.pms.marvel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.pms.marvel.jms.ProductJMSReciever;

/**
 * Servlet implementation class MessageFetchController
 */
@WebServlet("/MessageFetchController")
public class MessageFetchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageFetchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		//ProductJMSReciever jmsReciever = new ProductJMSReciever();
		//String msg = jmsReciever.recieveMessage();
		String msg="Hello Tufaila active mq is not started";
		pw.println("<h2>Here is the message for you : "+ msg);
		pw.println("<br/><br/><br/><h2><a href=product.html>Add Product</a>");


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
