package com.etiya.rentACar.core.exceptions.types;

import java.sql.SQLException;

public class BusinessException extends RuntimeException {

    public BusinessException(String message){
        super(message);
    }
}
