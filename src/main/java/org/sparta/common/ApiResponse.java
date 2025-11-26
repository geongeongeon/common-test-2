package org.sparta.common;

public class ApiResponse {
	private String message;
	//2
	public ApiResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
