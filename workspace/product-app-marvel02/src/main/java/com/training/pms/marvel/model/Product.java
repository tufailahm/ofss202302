package com.training.pms.marvel.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "products")

public class Product {
/*
 * 1st approach
	//No need to create any sequence in oracle , it will auto increment 1  and starts from 1
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")
	@SequenceGenerator(name = "seq_post", allocationSize = 1)
	private int productId;

*/
	//2nd approach
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post")
	@SequenceGenerator(sequenceName = "product_seq" , allocationSize = 1, name = "seq_post")
	private int productId;
	
	
	@Column
	private String productName;

	@Column
	private int quantityOnHand;

	@Column
	private int price;

	public Product() {

	}

	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantityOnHand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

}
