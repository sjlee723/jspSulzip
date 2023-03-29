package com.sulzip.app.category.dto;

//String categoryNumber;
//String categoryName;

public class CategoryDTO {
	private String categoryNumber;
	private String categoryName;

	public CategoryDTO() {}

	public String getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryDTO [categoryNumber=" + categoryNumber + ", categoryName=" + categoryName + "]";
	}
	
	
}
