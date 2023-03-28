package com.sulzip.app.order.dto;

//int orderNumber;
//String orderDate;
//int productEa;
//int productTotalPrice;
//String pickupStore;
//String orderMessage;
//int userNumber;

public class OrderDTO {
	int orderNumber;
	String orderDate;
	int productEa;
	int productTotalPrice;
	String pickupStore;
	String orderMessage;
	int userNumber;
	
	public OrderDTO() {
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getProductEa() {
		return productEa;
	}

	public void setProductEa(int productEa) {
		this.productEa = productEa;
	}

	public int getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(int productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public String getPickupStore() {
		return pickupStore;
	}

	public void setPickupStore(String pickupStore) {
		this.pickupStore = pickupStore;
	}

	public String getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderNumber=" + orderNumber + ", orderDate=" + orderDate + ", productEa=" + productEa
				+ ", productTotalPrice=" + productTotalPrice + ", pickupStore=" + pickupStore + ", orderMessage="
				+ orderMessage + ", userNumber=" + userNumber + "]";
	}
	
	
	
}
