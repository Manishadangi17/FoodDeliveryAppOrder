package com.capg.FoodDeliveryAppOrder.payload;
import com.FoodDelivery.payload.ApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class orderApiResponse {

    @Test
    public void testGettersAndSetters() {
        // Create an instance of ApiResponse
        ApiResponse apiResponse = new ApiResponse();

        // Set values using setters
        apiResponse.setMessage("Success message");
        apiResponse.setSuccess(true);
        apiResponse.setStatus(HttpStatus.OK);

        // Verify the values using getters
        assertEquals("Success message", apiResponse.getMessage());
        assertTrue(apiResponse.isSuccess());
        assertEquals(HttpStatus.OK, apiResponse.getStatus());
    }

    @Test
    public void testBuilder() {
        // Use the builder pattern to create an instance of ApiResponse
//        ApiResponse apiResponse = ApiResponse.builder()
//                .message("Success message")
//                .success(true)
//                .status(HttpStatus.OK)
//                .build();
//
//        // Verify the values
//        assertEquals("Success message", apiResponse.getMessage());
//        assertTrue(apiResponse.isSuccess());
//        assertEquals(HttpStatus.OK, apiResponse.getStatus());
   }
}
