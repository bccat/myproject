package com.easyway.website.cshx.common;

public class ResponseCode extends BaseObject {
	private static final long serialVersionUID = 5157420073975731579L;

	private int code;
	private String message;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
