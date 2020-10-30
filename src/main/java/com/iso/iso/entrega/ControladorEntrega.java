package com.iso.iso.entrega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("entrega")
public class ControladorEntrega {

    @Autowired
    private ServicioEntrega servicioEntrega;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Entrega save(@RequestBody @Valid Entrega entrega) {
        entrega.setEstadoEntrega(EstadoEntrega.POR_ASIGNAR);
        return servicioEntrega.crear(entrega);
    }
}
