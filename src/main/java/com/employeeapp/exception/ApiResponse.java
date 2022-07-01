package com.employeeapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiResponse {
	public ApiResponse(String message2, boolean b) {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private boolean success;
}
