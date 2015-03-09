package com.easyway.website.cshx.common;

public class ResponseResult<E> extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6962615715766024173L;

	private int code;
	private String message;
	private E result;
	private Long totalnumber;
	
	public ResponseResult() {

	}

	public ResponseResult(int code) {
		this.code = code;
	}

	public ResponseResult(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResponseResult(int code, E result) {
		this.code = code;
		this.result = result;
	}

	public ResponseResult(int code, String message, E result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}

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

	public E getResult() {
		return result;
	}

	public void setResult(E result) {
		this.result = result;
	}

	public Long getTotalnumber() {
		return totalnumber;
	}

	public void setTotalnumber(Long totalnumber) {
		this.totalnumber = totalnumber;
	}
}
