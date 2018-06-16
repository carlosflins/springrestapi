package com.carlosflins.springrestapi.model;

public class BaseResponse {
	private String status;
	private int code;
	
	public BaseResponse(String status, Integer code) {
		super();
		this.status = status;
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
