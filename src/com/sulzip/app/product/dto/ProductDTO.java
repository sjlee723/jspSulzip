package com.sulzip.app.product.dto;

//int productNumber;
//String productNameKor;
//String productNameEng;
//int productPrice;
//String productDesc;
//String productEa;
//String productVol;
//String productAlcoholDegree;
//String categoryNumber;
//String productSystemName;

public class ProductDTO {
	int productNumber;
	String productNameKor;
	String productNameEng;
	int productPrice;
	String productDesc;
	String productEa;
	String productVol;
	String productAlcoholDegree;
	String categoryNumber;
	String productSystemName;
	
	public ProductDTO() {
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductNameKor() {
		return productNameKor;
	}

	public void setProductNameKor(String productNameKor) {
		this.productNameKor = productNameKor;
	}

	public String getProductNameEng() {
		return productNameEng;
	}

	public void setProductNameEng(String productNameEng) {
		this.productNameEng = productNameEng;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductEa() {
		return productEa;
	}

	public void setProductEa(String productEa) {
		this.productEa = productEa;
	}

	public String getProductVol() {
		return productVol;
	}

	public void setProductVol(String productVol) {
		this.productVol = productVol;
	}

	public String getProductAlcoholDegree() {
		return productAlcoholDegree;
	}

	public void setProductAlcoholDegree(String productAlcoholDegree) {
		this.productAlcoholDegree = productAlcoholDegree;
	}

	public String getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getProductSystemName() {
		return productSystemName;
	}

	public void setProductSystemName(String productSystemName) {
		this.productSystemName = productSystemName;
	}

	@Override
	public String toString() {
		return "ProductDTO [productNumber=" + productNumber + ", productNameKor=" + productNameKor + ", productNameEng="
				+ productNameEng + ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productEa="
				+ productEa + ", productVol=" + productVol + ", productAlcoholDegree=" + productAlcoholDegree
				+ ", categoryNumber=" + categoryNumber + ", productSystemName=" + productSystemName + "]";
	}
	
	
}
