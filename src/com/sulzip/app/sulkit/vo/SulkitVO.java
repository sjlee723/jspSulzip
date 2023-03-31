package com.sulzip.app.sulkit.vo;

public class SulkitVO {
	private String psBridgeVol;
	private String productNameKor;
	private String productSystemName;
	
	public SulkitVO() {}

	public String getPsBridgeVol() {
		return psBridgeVol;
	}

	public void setPsBridgeVol(String psBridgeVol) {
		this.psBridgeVol = psBridgeVol;
	}

	public String getProductNameKor() {
		return productNameKor;
	}

	public void setProductNameKor(String productNameKor) {
		this.productNameKor = productNameKor;
	}

	public String getProductSystemName() {
		return productSystemName;
	}

	public void setProductSystemName(String productSystemName) {
		this.productSystemName = productSystemName;
	}

	@Override
	public String toString() {
		return "SulkitVO [psBridgeVol=" + psBridgeVol + ", productNameKor=" + productNameKor + ", productSystemName="
				+ productSystemName + "]";
	}
	
	
	
	
	
}
