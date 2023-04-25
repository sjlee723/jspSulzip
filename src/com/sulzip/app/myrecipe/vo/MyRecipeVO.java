package com.sulzip.app.myrecipe.vo;

//product_name_kor, p.product_system_name, b.pmBridge_vol 

public class MyRecipeVO {
	private String productNameKor;
	private String productSystemName;
	private String pmBridgeVol;
	
	public MyRecipeVO() {
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

	public String getPmBridgeVol() {
		return pmBridgeVol;
	}

	public void setPmBridgeVol(String pmBridgeVol) {
		this.pmBridgeVol = pmBridgeVol;
	}

	@Override
	public String toString() {
		return "MyRecipeVO [productNameKor=" + productNameKor + ", productSystemName=" + productSystemName
				+ ", pmBridgeVol=" + pmBridgeVol + "]";
	}

}
