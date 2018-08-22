package com.example.demo.vo.telnet;

/**
 * @author wangkai
 * @date 2018-08-16 17:51
 * @desc com.example.demo.vo.telnet
 */
public class SuccessResponse<T> extends BaseResponse {
	public SuccessResponse() {
		this("", null);
	}

	public SuccessResponse(String msg) {
		this(msg, null);
	}

	public SuccessResponse(T body) {
		this("", body);
	}

	public SuccessResponse(String msg, T body) {
		super(true, Integer.valueOf(1), msg, "");
		this.setBody(body);
	}

	public static SuccessResponse newInstance() {
		return new SuccessResponse();
	}

	public static SuccessResponse newInstance(String msg) {
		return new SuccessResponse(msg);
	}

	public static <T> SuccessResponse<T> newInstance(T body) {
		return new SuccessResponse(body);
	}
}
