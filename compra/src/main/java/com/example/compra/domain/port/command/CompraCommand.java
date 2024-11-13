package com.example.compra.domain.port.command;

import com.example.compra.domain.model.OrdenCompraModel;

public interface CompraCommand {

    OrdenCompraModel crearOrderCompra(OrdenCompraModel ordencompraModel);
    OrdenCompraModel actualizarOrderCompra(OrdenCompraModel ordencompraModel, Long id);
    void eliminarOrderCompra(Long id);

}
