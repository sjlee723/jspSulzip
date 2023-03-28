package com.sulzip.app.sulkit.dto;

//int sulkitNumber;
//String sulkitNameKor;
//String sulkitNameEng;
//String sulkitDesc;
//String sulkitRecipe;
//int sulkitPrice;



public class SulkitDTO {
	int sulkitNumber;
	String sulkitNameKor;
	String sulkitNameEng;
	String sulkitDesc;
	String sulkitRecipe;
	int sulkitPrice;
	
	public SulkitDTO() {
	}

	public int getSulkitNumber() {
		return sulkitNumber;
	}

	public void setSulkitNumber(int sulkitNumber) {
		this.sulkitNumber = sulkitNumber;
	}

	public String getSulkitNameKor() {
		return sulkitNameKor;
	}

	public void setSulkitNameKor(String sulkitNameKor) {
		this.sulkitNameKor = sulkitNameKor;
	}

	public String getSulkitNameEng() {
		return sulkitNameEng;
	}

	public void setSulkitNameEng(String sulkitNameEng) {
		this.sulkitNameEng = sulkitNameEng;
	}

	public String getSulkitDesc() {
		return sulkitDesc;
	}

	public void setSulkitDesc(String sulkitDesc) {
		this.sulkitDesc = sulkitDesc;
	}

	public String getSulkitRecipe() {
		return sulkitRecipe;
	}

	public void setSulkitRecipe(String sulkitRecipe) {
		this.sulkitRecipe = sulkitRecipe;
	}

	public int getSulkitPrice() {
		return sulkitPrice;
	}

	public void setSulkitPrice(int sulkitPrice) {
		this.sulkitPrice = sulkitPrice;
	}

	@Override
	public String toString() {
		return "SulkitDTO [sulkitNumber=" + sulkitNumber + ", sulkitNameKor=" + sulkitNameKor + ", sulkitNameEng="
				+ sulkitNameEng + ", sulkitDesc=" + sulkitDesc + ", sulkitRecipe=" + sulkitRecipe + ", sulkitPrice="
				+ sulkitPrice + "]";
	}
	
	
	
}
