package com.sulzip.app.admin.vo;

public class BoardVO {
	private String title;
	private String id;
	private int number;
	
	public BoardVO() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", id=" + id + ", number=" + number + "]";
	}

	
	
	
	
	
}
