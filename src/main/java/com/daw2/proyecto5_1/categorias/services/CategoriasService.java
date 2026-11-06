package com.daw2.proyecto5_1.categorias.services;

import com.daw2.proyecto5_1.categorias.dto.CategoriaCreateRequest;
import com.daw2.proyecto5_1.categorias.dto.CategoriaResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoriasService {
    Page<CategoriaResponse> findAll(Pageable pageable);
    CategoriaResponse findById(Long id);
    CategoriaResponse save(CategoriaCreateRequest request);
    void deleteById(Long id);
}