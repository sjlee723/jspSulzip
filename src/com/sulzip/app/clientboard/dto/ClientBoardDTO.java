package com.sulzip.app.clientboard.dto;

//int boardNumber;
//String boardDate;
//String boardTitle;
//String boardContent;
//String boardCondition;
//int userNumber;

public class ClientBoardDTO {
	private int boardNumber;
	private String boardDate;
	private String boardTitle;
	private String boardContent;
	private String boardCondition;
	private int userNumber;
	private int startRow;
	private int rowCount;
	private String userId;

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public ClientBoardDTO() {}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardCondition() {
		return boardCondition;
	}

	public void setBoardCondition(String boardCondition) {
		this.boardCondition = boardCondition;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "ClientBoardDTO [boardNumber=" + boardNumber + ", boardDate=" + boardDate + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardCondition=" + boardCondition + ", userNumber=" + userNumber
				+ ", startRow=" + startRow + ", rowCount=" + rowCount + ", userId=" + userId + "]";
	}



	
	
}
