package com.training.spring.pms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.spring.pms.model.MailMail;
import com.training.spring.pms.model.Message;
import com.training.spring.pms.model.Product;
import com.training.spring.pms.service.ProductService;
import com.training.spring.pms.service.ProductServiceImpl;

//Harish
@Controller
public class ProductController {
	
	
	@Autowired
	MailMail mail;
	
	@Autowired
	@Qualifier("productServiceImpl")
	ProductService productService	;
	
	@Autowired(required = false)
	Message message;

	@RequestMapping("/productDetail")
	public String productDetail(Product product , HttpServletRequest request) {
		HttpSession session = request.getSession();
		//save this product in DB
		System.out.println("1.###ProductController output : Product with product name , "+product.getProductName()+ "saved in DB");
		productService.saveProduct(product);
	//	mail.sendMail("Rahul", "A new product with product name : "+product.getProductName() + " has been added" );
		session.setAttribute("productData", product);
		return "bill";
	}
}