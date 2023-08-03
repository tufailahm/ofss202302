package com.training.pms.marvel.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.pms.marvel.dao.ProductDAO;
import com.training.pms.marvel.model.Product;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int price = Integer.parseInt(request.getParameter("price"));
				
		//why we have created product object here
		// more clarity will come as we move ahead
		//in jsp and jpa 
		Product product = new Product(productId, productName, quantityOnHand, 
				price);
		int newPrice = (int) (price + price * 0.18);
		product.setPrice(newPrice);
		
		//product 
		//save the data 
		ProductDAO dao = new ProductDAO();
		dao.saveProduct(product);
		
		HttpSession session = request.getSession();
		session.setAttribute("productData", product);
		
		pw.println("PRODUCT ID: "+product.getProductId());
		pw.println("PRODUCT NAME: "+product.getProductName());
		pw.println("QUANTITY ON HAND: "+product.getQuantityOnHand());
		pw.println("PRICE: "+product.getPrice());
		
		//JDBC 
		pw.println("<br/><br/><br/><a href=index.jsp>Home</a>");
		pw.println("<h2><a href=ProductCatalogue>Product Catalogue<a>");
		pw.println("<br/><a href=product.html>Back To Product Form</a>");
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
