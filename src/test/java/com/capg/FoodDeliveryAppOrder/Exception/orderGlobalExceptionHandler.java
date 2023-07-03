package com.capg.FoodDeliveryAppOrder.Exception;

import com.FoodDelivery.exceptions.GlobalExceptionHandler;
import com.FoodDelivery.exceptions.ResourcesNotFoundException;
import com.FoodDelivery.payload.ApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class orderGlobalExceptionHandler {
    @Test
    public void testHandlerResourceNotFoundException() {
        // Create a mock instance of ResourcesNotFoundException
        ResourcesNotFoundException exception = mock(ResourcesNotFoundException.class);

        // Create an instance of GlobalExceptionHandler
        GlobalExceptionHandler exceptionHandler = new GlobalExceptionHandler();

        // Call the handlerResourceNotFoundException method
//        ResponseEntity<ApiResponse> responseEntity = exceptionHandler.handlerResourceNotFoundException(exception);
//
//        // Verify the response
//        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
//        assertEquals(true, responseEntity.getBody().isSuccess());
//        assertEquals(exception.getMessage(), responseEntity.getBody().getMessage());
    }

}
