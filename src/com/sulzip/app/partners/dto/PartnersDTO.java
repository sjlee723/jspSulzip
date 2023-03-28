package com.sulzip.app.partners.dto;

//int partnersNumber;
//String userContact;
//String userEmail;
//String partnersLoc;
//String partnersLocation;
//String partnersStatus;
//int userNumber;

public class PartnersDTO {
	int partnersNumber;
	String userContact;
	String userEmail;
	String partnersLoc;
	String partnersLocation;
	String partnersStatus;
	int userNumber;
	
	public PartnersDTO() {
	}

	public int getPartnersNumber() {
		return partnersNumber;
	}

	public void setPartnersNumber(int partnersNumber) {
		this.partnersNumber = partnersNumber;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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

	@Override
	public String toString() {
		return "PartnersDTO [partnersNumber=" + partnersNumber + ", userContact=" + userContact + ", userEmail="
				+ userEmail + ", partnersLoc=" + partnersLoc + ", partnersLocation=" + partnersLocation
				+ ", partnersStatus=" + partnersStatus + ", userNumber=" + userNumber + "]";
	}
	
	
	
}
