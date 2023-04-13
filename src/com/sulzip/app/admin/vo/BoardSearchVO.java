package com.sulzip.app.admin.vo;

public class BoardSearchVO {
	private String category;
	private String keyword;
	private String select;
	
	public BoardSearchVO() {}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}


	@Override
	public String toString() {
		return "BoardSearchVO [category=" + category + ", keyword=" + keyword + ", select=" + select + "]";
	}

	
	
}
