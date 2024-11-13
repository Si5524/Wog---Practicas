package com.example.compra.infrastructure;

import com.example.compra.domain.model.OrdenCompraModel;
import com.example.compra.domain.port.command.DetalleCompraCommand;
import com.example.compra.infrastructure.Jpa.JpaDetalleCompraRepository;

public class DetalleCompraCommandImpl implements DetalleCompraCommand {

    private JpaDetalleCompraRepository jpaDetalleCompraRepository;

    public DetalleCompraCommandImpl(JpaDetalleCompraRepository jpaDetalleCompraRepository) {
        this.jpaDetalleCompraRepository = jpaDetalleCompraRepository;
    }

    public OrdenCompraModel crearOrderCompra(OrdenCompraModel ordenCompraModel) {

        return jpaDetalleCompraRepository.save(ordenCompraModel);

    }

    public OrdenCompraModel actualizarOrderCompra(OrdenCompraModel ordenCompraModel, Long id) {

        return;
    }

    public void eliminarOrderCompra(Long id) {

        jpaDetalleCompraRepository.deleteById(id);
    }
}
