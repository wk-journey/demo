package com.example.demo.vo.telnet;

import java.io.Serializable;

/**
 * @author wangkai
 * @date 2018-08-16 17:48
 * @desc com.example.demo.vo.telnet
 */
public class BaseResponse<T> implements Serializable {
	public static final int SUCCESS_CODE = 1;
	public static final int ERROR_CODE = 0;
	private boolean success = true;
	private String msg = "";
	private Integer bizCode = Integer.valueOf(1);
	private String bizInfo = "";
	private T body;

	public BaseResponse() {
	}

	public BaseResponse(boolean success) {
		this.success = success;
	}

	public BaseResponse(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public BaseResponse(boolean success, Integer bizCode, String msg) {
		this.success = success;
		this.bizCode = bizCode;
		this.msg = msg;
	}

	public BaseResponse(boolean success, String msg, String bizInfo) {
		this.success = success;
		this.msg = msg;
		this.bizInfo = bizInfo;
	}

	public BaseResponse(boolean success, Integer bizCode, String msg, String bizInfo) {
		this.success = success;
		this.bizCode = bizCode;
		this.msg = msg;
		this.bizInfo = bizInfo;
	}

	public static int getSuccessCode() {
		return SUCCESS_CODE;
	}

	public static int getErrorCode() {
		return ERROR_CODE;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getBizCode() {
		return bizCode;
	}

	public void setBizCode(Integer bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizInfo() {
		return bizInfo;
	}

	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}
}
