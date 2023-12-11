package com.saleshistory.dto;

public class ApiError {
	private String msg;
	private int status;
	private long timeStamp;
	
	
	public long getTimeStamp() {
		return timeStamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
