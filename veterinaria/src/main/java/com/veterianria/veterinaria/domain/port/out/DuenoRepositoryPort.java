package com.veterianria.veterinaria.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.veterianria.veterinaria.domain.model.DuenoModel;
import com.veterianria.veterinaria.domain.model.Dto.DuenoDto;

public interface DuenoRepositoryPort {

    Optional<DuenoModel> buscarDuenoId(Long id);
    
    List<DuenoModel> buscarDuenso();

    DuenoModel creardueno(DuenoModel duenoModel);

    DuenoModel actualzarTelefono(DuenoDto duenoDto, Long id);

    void eliminarDueno(Long id);
}
