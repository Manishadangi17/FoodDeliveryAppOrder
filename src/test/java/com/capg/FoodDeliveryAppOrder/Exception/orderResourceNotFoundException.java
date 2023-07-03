package com.capg.FoodDeliveryAppOrder.Exception;
import org.junit.jupiter.api.Test;

import com.FoodDelivery.exceptions.ResourcesNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class orderResourceNotFoundException {
    @Test
    public void testDefaultConstructor() {
        // Create an instance of ResourcesNotFoundException using the default constructor
        ResourcesNotFoundException exception = new ResourcesNotFoundException();

        // Verify the exception message
        assertEquals("Resource not Found on server !!", exception.getMessage());
    }

    @Test
    public void testConstructorWithMessage() {
        // Create an instance of ResourcesNotFoundException with a custom message
        String customMessage = "Custom error message";
        ResourcesNotFoundException exception = new ResourcesNotFoundException(customMessage);

        // Verify the exception message
        assertEquals(customMessage, exception.getMessage());
    }

}
