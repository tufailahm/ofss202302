package com.training.pms.marvel.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.pms.marvel.dao.ProductDAO;
import com.training.pms.marvel.model.Product;
import com.training.pms.marvel.utility.ProductData;

/**
 * Servlet implementation class ProductFetchController
 */
@WebServlet("/ProductFetchController")
public class ProductFetchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductFetchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//List<Product> products = ProductData.getAllProducts();
		ProductDAO productDAO = new ProductDAO();
		List<Product> products  =  productDAO.getProducts();
		HttpSession session = request.getSession();
		session.setAttribute("allProducts", products);
		RequestDispatcher requestDispatcher = 
				request.getRequestDispatcher("viewAllProducts2.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
