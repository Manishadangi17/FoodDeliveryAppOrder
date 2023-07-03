package com.FoodDelivery.payload;

import org.springframework.http.HttpStatus;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
	private String message;
	private boolean success;
	private HttpStatus status;
	public static ApiResponseBuilder builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
