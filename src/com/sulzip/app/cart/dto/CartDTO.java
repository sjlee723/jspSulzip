package com.sulzip.app.cart.dto;

//int userNumber;
//int productNumber;
//int productTotalPrice;
//int productEa;
//int orderNumber;

public class CartDTO {
	int userNumber;
	int productNumber;
	int productTotalPrice;
	int productEa;
	int orderNumber;
	
	public CartDTO() {
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public int getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(int productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public int getProductEa() {
		return productEa;
	}

	public void setProductEa(int productEa) {
		this.productEa = productEa;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "CartDTO [userNumber=" + userNumber + ", productNumber=" + productNumber + ", productTotalPrice="
				+ productTotalPrice + ", productEa=" + productEa + ", orderNumber=" + orderNumber + "]";
	}
	
	
}
