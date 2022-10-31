package com.training.pms.galaxe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "freshproducts")
@Data
public class Product {
	
	@Id
	public int productId;
	public String productName;
	public int quantityOnHand;
	public int price;

}

//Instead of all these add @Data(fromLombok)

//	public Product(int productId, String productName, int quantityOnHand, int price) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.quantityOnHand = quantityOnHand;
//		this.price = price;
//	}
//     
//
//	public int getProductId() {
//		return productId;
//	}
//
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//
//
//	public String getProductName() {
//		return productName;
//	}
//
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//
//	public int getQuantityOnHand() {
//		return quantityOnHand;
//	}
//
//
//	public void setQuantityOnHand(int quantityOnHand) {
//		this.quantityOnHand = quantityOnHand;
//	}
//
//
//	public int getPrice() {
//		return price;
//	}
//
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//     
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
//				+ ", price=" + price + "]";
//	}
//
//
//	public Product() {
//		// TODO Auto-generated constructor stub
//	}
//
//}
