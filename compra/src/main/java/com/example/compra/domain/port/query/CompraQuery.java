package com.example.compra.domain.port.query;

import java.util.List;
import java.util.Optional;

import com.example.compra.domain.model.OrdenCompraModel;

public interface CompraQuery {

    Optional<OrdenCompraModel> buscarCompraPorId(Long id);

    List<OrdenCompraModel> buscarCompras();
    

}
