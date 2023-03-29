package com.sulzip.app.file.dto;

//String fileSystemName; 마이레시피 이미지 파일 이름 (서버(관리자)등록)
//String fileOriginalName; 마이레시피 이미지 파일 이름 (고객등록)
//int myRecipeNumber;

public class FileDTO {
	private String fileSystemName; 
	private String fileOriginalName;
	private int myRecipeNumber;
	
	public FileDTO() {}

	public String getFileSystemName() {
		return fileSystemName;
	}

	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}

	public String getFileOriginalName() {
		return fileOriginalName;
	}

	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}

	public int getMyRecipeNumber() {
		return myRecipeNumber;
	}

	public void setMyRecipeNumber(int myRecipeNumber) {
		this.myRecipeNumber = myRecipeNumber;
	}

	@Override
	public String toString() {
		return "FileDTO [fileSystemName=" + fileSystemName + ", fileOriginalName=" + fileOriginalName
				+ ", myRecipeNumber=" + myRecipeNumber + "]";
	}
	
	
}
