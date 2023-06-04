package com.educandoweb.demo.services.exceptions;

import jakarta.annotation.Resource;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found . Id " + id);


    }





}
