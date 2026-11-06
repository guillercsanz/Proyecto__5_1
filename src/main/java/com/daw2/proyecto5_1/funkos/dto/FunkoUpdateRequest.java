package com.daw2.proyecto5_1.funkos.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

/** Entra en PATCH: todo opcional, solo reglas de formato. */
public record FunkoUpdateRequest(
        @Size(max = 100) String nombre,
        @DecimalMin(value = "0.0", inclusive = false) BigDecimal precio,
        @PositiveOrZero Integer cantidad,
        String categoria
) {}