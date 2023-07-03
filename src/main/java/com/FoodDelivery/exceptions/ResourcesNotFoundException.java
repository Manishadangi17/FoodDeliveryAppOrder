package com.FoodDelivery.exceptions;

public class ResourcesNotFoundException extends RuntimeException {
	public ResourcesNotFoundException() {
		super("Resource not Found on server !!");
	}
	
	public ResourcesNotFoundException(String msg) {
		super(msg);
	}

}
