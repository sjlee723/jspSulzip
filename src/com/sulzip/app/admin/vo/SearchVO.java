package com.sulzip.app.admin.vo;

public class SearchVO {
	
	String keyword;
	String category;
	String language;
	
	public SearchVO() {}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "SearchVO [keyword=" + keyword + ", category=" + category + ", language=" + language + "]";
	}
	
	
}
