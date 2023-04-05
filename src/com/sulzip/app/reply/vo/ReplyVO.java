package com.sulzip.app.reply.vo;

//private int replyNumber;
//private String replyContent;
//private String replyDate;
//private int boardNumber;
//private int userNumber;

public class ReplyVO {
	private int replyNumber;
	private String replyContent;
	private String replyDate;
	private int boardNumber;
	private int userNumber;
	private String userId;
	
	public ReplyVO() {
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ReplyVO [replyNumber=" + replyNumber + ", replyContent=" + replyContent + ", replyDate=" + replyDate
				+ ", boardNumber=" + boardNumber + ", userNumber=" + userNumber + ", userId=" + userId + "]";
	}

	
}
