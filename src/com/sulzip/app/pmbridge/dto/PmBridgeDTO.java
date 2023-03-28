package com.sulzip.app.pmbridge.dto;

//int myRecipeNumber;
//int productNumber;
//String pmBridgeVol;

public class PmBridgeDTO {
	int myRecipeNumber;
	int productNumber;
	String pmBridgeVol;

	public PmBridgeDTO() {
	}

	public int getMyRecipeNumber() {
		return myRecipeNumber;
	}

	public void setMyRecipeNumber(int myRecipeNumber) {
		this.myRecipeNumber = myRecipeNumber;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getPmBridgeVol() {
		return pmBridgeVol;
	}

	public void setPmBridgeVol(String pmBridgeVol) {
		this.pmBridgeVol = pmBridgeVol;
	}

	@Override
	public String toString() {
		return "PmBridgeDTO [myRecipeNumber=" + myRecipeNumber + ", productNumber=" + productNumber + ", pmBridgeVol="
				+ pmBridgeVol + "]";
	}
	
	
}
