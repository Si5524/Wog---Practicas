package com.veterianria.veterinaria.application;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.veterianria.veterinaria.domain.model.DuenoModel;
import com.veterianria.veterinaria.domain.model.Dto.DuenoDto;

import com.veterianria.veterinaria.domain.port.out.DuenoRepositoryPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class DuenoService {

    private final DuenoRepositoryPort duenoRepositoryPort;

    public DuenoModel crearDueno(DuenoModel duenoModel) {

        return duenoRepositoryPort.creardueno(duenoModel);
    }

    
    public Optional<DuenoModel> buscarDuenoId(Long id) {

        return duenoRepositoryPort.buscarDuenoId(id);
    }

    
    public List<DuenoModel> buscarDuenos() {

        return duenoRepositoryPort.buscarDuenso();
    }

    
    public DuenoModel actualizarTelefonoDueno(DuenoDto duenoDto, Long id) {

        return duenoRepositoryPort.actualzarTelefono(duenoDto, id);
    }

    
    public void eliminarDueno(Long id) {

        duenoRepositoryPort.eliminarDueno(id);

    }

}
