package com.example.compra.domain.port.command;

import com.example.compra.domain.model.DetalleCompraModel;

public interface DetalleCompraCommand {

    String crearDetalleCompra(DetalleCompraModel detallecompramodel, Long ordenId);
    String actualizarDetalleCompra(DetalleCompraModel detalleCompraModel, Long id);
    void eliminarDetalleCompra(Long id);
}
