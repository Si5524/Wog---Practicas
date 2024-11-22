package com.veterianria.veterinaria.infrastructure.Jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.veterianria.veterinaria.domain.model.DuenoModel;
import com.veterianria.veterinaria.domain.model.Dto.DuenoDto;
import com.veterianria.veterinaria.domain.port.out.DuenoRepositoryPort;
import com.veterianria.veterinaria.infrastructure.DuenoEntity;
import com.veterianria.veterinaria.infrastructure.Jpa.mapper.DuenoMapper;
import com.veterianria.veterinaria.infrastructure.Jpa.reporitory.DuenoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class DuenoRepositoryPortImpl implements DuenoRepositoryPort {

    private final DuenoRepository duenoRepository;

    @Override
    public Optional<DuenoModel> buscarDuenoId(Long id) {

        DuenoEntity duenoEntidad = duenoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No se encontro el usuario ctm"));

        DuenoModel duenoModel = DuenoMapper.MAPPER.toModel(duenoEntidad);

        return Optional.of(duenoModel);

    }

    @Override
    public void eliminarDueno(Long id) {

        duenoRepository.deleteById(id);
    }

    @Override
    public List<DuenoModel> buscarDuenso() {

        List<DuenoEntity> duenos = duenoRepository.findAll();

        return duenos.stream().map(DuenoMapper.MAPPER::toModel).toList();
    }

    @Override
    public DuenoModel actualzarTelefono(DuenoDto duenoDto, Long id) {

        DuenoEntity duenoEntidad = duenoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No se encontro el usuario con el id" + id));


        if (duenoEntidad != null) {
            duenoEntidad.setTelefono(duenoDto.getTelefono());
            duenoRepository.save(duenoEntidad);
        }

        return DuenoMapper.MAPPER.toModel(duenoEntidad);

    }

    @Override
    public DuenoModel creardueno(DuenoModel duenoModel) {

        DuenoEntity duenoEntidad = DuenoMapper.MAPPER.toEntity(duenoModel);

        duenoRepository.save(duenoEntidad);

        return DuenoMapper.MAPPER.toModel(duenoEntidad);

    }
}
