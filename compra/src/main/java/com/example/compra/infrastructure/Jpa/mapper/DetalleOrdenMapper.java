package com.example.compra.infrastructure.Jpa.mapper;

import com.example.compra.domain.model.DetalleCompraModel;
import com.example.compra.infrastructure.entity.DetalleCompraEntity;
import org.springframework.stereotype.Component;

@Component
public class DetalleOrdenMapper {

    // Convertir de DetalleCompraEntity a DetalleCompraModel
    public DetalleCompraModel toModel(DetalleCompraEntity detalleCompraEntity) {
        if (detalleCompraEntity == null) {
            return null;  // Si la entidad es null, retornamos null
        }

        DetalleCompraModel detalleCompraModel = new DetalleCompraModel();
        detalleCompraModel.setId(detalleCompraEntity.getId());
        detalleCompraModel.setOrdenId(detalleCompraEntity.getOrdenId());
        detalleCompraModel.setProducto(detalleCompraEntity.getProducto());
        detalleCompraModel.setCantidad(detalleCompraEntity.getCantidad());
        detalleCompraModel.setPrecio(detalleCompraEntity.getPrecio());
        detalleCompraModel.setTotal(detalleCompraEntity.getTotal());
        
        // Si hay más campos, mapea aquí

        return detalleCompraModel;
    }

    // Convertir de DetalleCompraModel a DetalleCompraEntity
    public DetalleCompraEntity toEntity(DetalleCompraModel detalleCompraModel) {
        if (detalleCompraModel == null) {
            return null;  // Si el modelo es null, retornamos null
        }

        DetalleCompraEntity detalleCompraEntity = new DetalleCompraEntity();
        detalleCompraEntity.setId(detalleCompraModel.getId());
        detalleCompraEntity.setOrdenId(detalleCompraModel.getOrdenId());
        detalleCompraEntity.setProducto(detalleCompraModel.getProducto());
        detalleCompraEntity.setCantidad(detalleCompraModel.getCantidad());
        detalleCompraEntity.setPrecio(detalleCompraModel.getPrecio());
        detalleCompraEntity.setTotal(detalleCompraModel.getTotal());
        
        // Si hay más campos, mapea aquí

        return detalleCompraEntity;
    }
}
