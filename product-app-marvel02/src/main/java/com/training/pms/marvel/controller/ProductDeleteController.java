package com.training.pms.marvel.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.pms.marvel.dao.ProductDAO;
import com.training.pms.marvel.jms.ProductJMSSender;
import com.training.pms.marvel.model.Product;

/**
 * Servlet implementation class ProductDeleteController
 */
@WebServlet("/ProductDeleteController")
public class ProductDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductDeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductDAO dao = new ProductDAO();
		int productId = Integer.parseInt(request.getParameter("productId"));
		HttpSession session = request.getSession();

		String operation = request.getParameter("operation");
		if (operation.equals("delete")) {
			if (dao.isProductExists(productId)) {
				session.setAttribute("message", "Product with product id :" + productId + " deleted successfuly");

				dao.deleteProduct(productId);
			} else {
				session.setAttribute("message", "No product with product id :" + productId + "exists");
			}
		} else if (operation.equals("update")) {
			String productName = request.getParameter("productName");
			int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
			int price = Integer.parseInt(request.getParameter("price"));
			Product product = new Product(productId, productName, quantityOnHand, price);
			dao.updateProduct(product);

			// if the qoh is less than 20 then send jms message
			if (quantityOnHand <= 20) {
				ProductJMSSender jmsSender = new ProductJMSSender();
				String result = jmsSender
						.sendProductOutOfStockMessage("Product : " + productName + " is going to be out of stock soon qoh is : "+quantityOnHand);
				session.setAttribute("message", result);
			}
		} else if (operation.equals("search")) {
			String productName = request.getParameter("productName");
			List<Product> products = dao.searchByProductNameUsingCriteria(productName);
			session.setAttribute("message", "Search result for : " + productName);
			session.setAttribute("allProducts", products);
			RequestDispatcher rd = request.getRequestDispatcher("viewAllProducts2.jsp");
			rd.forward(request, response);
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher("ProductFetchController");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
