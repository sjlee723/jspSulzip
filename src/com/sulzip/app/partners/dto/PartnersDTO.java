package com.sulzip.app.partners.dto;

//int partnersNumber;
//String partnersContact;
//String partnersEmail;
//String partnersLoc;
//String partnersLocation;
//String partnersStatus;
//int userNumber;
//String partnersName;
//String partnersContent;

public class PartnersDTO {
	private int partnersNumber;
	private String partnersContact;
	private String partnersEmail;
	private String partnersLoc;
	private String partnersLocation;
	private String partnersStatus;
	private int userNumber;
	private String partnersName;
	private String partnersContent;
	
	public PartnersDTO() {
	}

	public int getPartnersNumber() {
		return partnersNumber;
	}

	public void setPartnersNumber(int partnersNumber) {
		this.partnersNumber = partnersNumber;
	}

	public String getPartnersContact() {
		return partnersContact;
	}

	public void setPartnersContact(String partnersContact) {
		this.partnersContact = partnersContact;
	}

	public String getPartnersEmail() {
		return partnersEmail;
	}

	public void setPartnersEmail(String partnersEmail) {
		this.partnersEmail = partnersEmail;
	}

	public String getPartnersLoc() {
		return partnersLoc;
	}

	public void setPartnersLoc(String partnersLoc) {
		this.partnersLoc = partnersLoc;
	}

	public String getPartnersLocation() {
		return partnersLocation;
	}

	public void setPartnersLocation(String partnersLocation) {
		this.partnersLocation = partnersLocation;
	}

	public String getPartnersStatus() {
		return partnersStatus;
	}

	public void setPartnersStatus(String partnersStatus) {
		this.partnersStatus = partnersStatus;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getPartnersName() {
		return partnersName;
	}

	public void setPartnersName(String partnersName) {
		this.partnersName = partnersName;
	}

	public String getPartnersContent() {
		return partnersContent;
	}

	public void setPartnersContent(String partnersContent) {
		this.partnersContent = partnersContent;
	}

	@Override
	public String toString() {
		return "PartnersDTO [partnersNumber=" + partnersNumber + ", partnersContact=" + partnersContact
				+ ", partnersEmail=" + partnersEmail + ", partnersLoc=" + partnersLoc + ", partnersLocation="
				+ partnersLocation + ", partnersStatus=" + partnersStatus + ", userNumber=" + userNumber
				+ ", partnersName=" + partnersName + ", partnersContent=" + partnersContent + "]";
	}
	
	
	
}
