package com.example.compra.domain.port.query;

import java.util.List;
import java.util.Optional;

import com.example.compra.domain.model.DetalleCompraModel;

public interface DetalleCompraQuery {

    Optional<DetalleCompraModel> buscarPagoPorId(Long id);
    
    List<DetalleCompraModel> buscarPagos(Long id);
    
}
