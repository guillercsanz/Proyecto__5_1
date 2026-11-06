package com.daw2.proyecto5_1.funkos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class FunkoConflictException extends RuntimeException {
    public FunkoConflictException(String mensaje) { super(mensaje); }
}