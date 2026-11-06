package com.daw2.proyecto5_1.categorias.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CategoriaConflictException extends RuntimeException {
    public CategoriaConflictException(String mensaje) { super(mensaje); }
}