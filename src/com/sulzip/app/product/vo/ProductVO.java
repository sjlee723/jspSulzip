package com.sulzip.app.product.vo;

public class ProductVO {
	
	int number;
	int category;
	String nameKor;
	String nameEng;
	int price;
	String keyword;
	
	public ProductVO() {}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getNameKor() {
		return nameKor;
	}

	public void setNameKor(String nameKor) {
		this.nameKor = nameKor;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "ProductVO [number=" + number + ", category=" + category + ", nameKor=" + nameKor + ", nameEng="
				+ nameEng + ", price=" + price + ", keyword=" + keyword + "]";
	}

	

	
	
	
	
	
}
