package com.training.spring.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.spring.pms.dao.ProductDAO;
import com.training.spring.pms.model.Message;
import com.training.spring.pms.model.Product;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ProductController {
	
	@Autowired(required = false)
	ProductDAO dao;
	
	@Autowired(required = false)
	Message message;

	@RequestMapping("/productDetail")
	public String productDetail(Product product , HttpServletRequest request) {
		HttpSession session = request.getSession();
		//save this product in DB
		
		System.out.println("Message from message class is : "+message.sayHello());
		
		dao.saveProduct(product);
		
		session.setAttribute("productData", product);
		return "bill";
	}
}