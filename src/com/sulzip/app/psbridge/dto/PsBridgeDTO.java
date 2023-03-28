package com.sulzip.app.psbridge.dto;

//int sulkitNumber;
//int productNumber;
//String psBridgeVol;

public class PsBridgeDTO {
	int sulkitNumber;
	int productNumber;
	String psBridgeVol;

	public PsBridgeDTO() {
	}

	public int getSulkitNumber() {
		return sulkitNumber;
	}

	public void setSulkitNumber(int sulkitNumber) {
		this.sulkitNumber = sulkitNumber;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getPsBridgeVol() {
		return psBridgeVol;
	}

	public void setPsBridgeVol(String psBridgeVol) {
		this.psBridgeVol = psBridgeVol;
	}

	@Override
	public String toString() {
		return "PsBridgeDTO [sulkitNumber=" + sulkitNumber + ", productNumber=" + productNumber + ", psBridgeVol="
				+ psBridgeVol + "]";
	}
	
	
}
