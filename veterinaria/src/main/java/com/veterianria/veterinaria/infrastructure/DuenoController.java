package com.veterianria.veterinaria.infrastructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterianria.veterinaria.application.DuenoService;
import com.veterianria.veterinaria.domain.model.DuenoModel;
import com.veterianria.veterinaria.domain.model.Dto.DuenoDto;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/dueno")
@AllArgsConstructor

public class DuenoController {

    private DuenoService duenoService;

    @GetMapping
    public List<DuenoModel> getMethodName() {
        return duenoService.buscarDuenos();
    }

    @GetMapping("/{id}")
    public Optional<DuenoModel> getMethodName(@PathVariable Long id) {
        return duenoService.buscarDuenoId(id);
    }

    @PostMapping
    public DuenoModel postMethodName(@RequestBody DuenoModel duenoModel) {

        return duenoService.crearDueno(duenoModel);
    }

    @PutMapping("/{id}")
    public DuenoModel putMethodName(@PathVariable Long id, @RequestBody DuenoDto duenoDto) {

        return duenoService.actualizarTelefonoDueno(duenoDto, id);

    }

    @DeleteMapping("/{id}")
    public void eliminarDueno(@PathVariable Long id) {

        duenoService.eliminarDueno(id);
    }

}
