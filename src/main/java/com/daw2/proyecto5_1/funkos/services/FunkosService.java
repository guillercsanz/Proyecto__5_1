package com.daw2.proyecto5_1.funkos.services;
import com.daw2.proyecto5_1.funkos.dto.FunkoCreateRequest;
import com.daw2.proyecto5_1.funkos.dto.FunkoResponse;
import com.daw2.proyecto5_1.funkos.dto.FunkoUpdateRequest;
import org.springframework.data.domain.*;

public interface FunkosService {
    Page<FunkoResponse> findAll(Pageable pageable);
    FunkoResponse findById(Long id);
    FunkoResponse save(FunkoCreateRequest request);
    FunkoResponse replace(Long id, FunkoCreateRequest request);
    FunkoResponse update(Long id, FunkoUpdateRequest request);
    void deleteById(Long id);
}