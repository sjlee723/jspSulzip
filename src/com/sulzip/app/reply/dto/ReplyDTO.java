package com.sulzip.app.reply.dto;

//`reply_number` int not null,
//`reply_content` varchar(1000) null,
//`reply_date` datetime not null,
//`board_number` int not null,
//`user_number` int not null

public class ReplyDTO {
	private int replyNumber;
	private String replyContent;
	private String replyDate;
	private int boardNumber;
	private int userNumber;
	
	public ReplyDTO() {
	}

	public int getReplyNumber() {
		return replyNumber;
	}

	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "ReplyDTO [replyNumber=" + replyNumber + ", replyContent=" + replyContent + ", replyDate=" + replyDate
				+ ", boardNumber=" + boardNumber + ", userNumber=" + userNumber + "]";
	}
	
	
	
}
