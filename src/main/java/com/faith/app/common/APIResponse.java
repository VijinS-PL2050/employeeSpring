package com.faith.app.common;

public class APIResponse {
	
	private Integer status;//to store response from server
	private Object data;
	private Object error;//to store error messages
	
	//default
	public APIResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//paramertised
	public APIResponse(Integer status, Object data, Object error) {
		super();
		this.status = status;
		this.data = data;
		this.error = error;
	}
	
	//getter and setter
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object error) {
		this.error = error;
	}
	
	
	

}
