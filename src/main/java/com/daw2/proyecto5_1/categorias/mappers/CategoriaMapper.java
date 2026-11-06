package com.daw2.proyecto5_1.categorias.mappers;

import com.daw2.proyecto5_1.categorias.dto.CategoriaCreateRequest;
import com.daw2.proyecto5_1.categorias.dto.CategoriaResponse;
import com.daw2.proyecto5_1.categorias.models.Categoria;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapper {

    public CategoriaResponse toResponse(Categoria c, long numeroDeFunkos) {
        return new CategoriaResponse(c.getId(), c.getNombre(), numeroDeFunkos);
    }

    public Categoria toModel(CategoriaCreateRequest r) {
        return new Categoria(r.nombre().trim().toUpperCase());
    }
}