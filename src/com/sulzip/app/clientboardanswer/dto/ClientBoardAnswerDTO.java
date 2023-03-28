package com.sulzip.app.clientboardanswer.dto;

//int clientBoardAnswerNumber;
//String clientBoardAnswerAnswer;
//int boardNumber;

public class ClientBoardAnswerDTO {
	int clientBoardAnswerNumber;
	String clientBoardAnswerAnswer;
	int boardNumber;

	public ClientBoardAnswerDTO() {
	}

	public int getClientBoardAnswerNumber() {
		return clientBoardAnswerNumber;
	}

	public void setClientBoardAnswerNumber(int clientBoardAnswerNumber) {
		this.clientBoardAnswerNumber = clientBoardAnswerNumber;
	}

	public String getClientBoardAnswerAnswer() {
		return clientBoardAnswerAnswer;
	}

	public void setClientBoardAnswerAnswer(String clientBoardAnswerAnswer) {
		this.clientBoardAnswerAnswer = clientBoardAnswerAnswer;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	@Override
	public String toString() {
		return "ClientBoardAnswerDTO [clientBoardAnswerNumber=" + clientBoardAnswerNumber + ", clientBoardAnswerAnswer="
				+ clientBoardAnswerAnswer + ", boardNumber=" + boardNumber + "]";
	}
	
	
}
