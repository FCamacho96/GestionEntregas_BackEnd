package com.iso.iso.entrega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEntrega {

    @Autowired
    private RepositorioEntrega repositorioEntrega;

    public Entrega crear(Entrega entrega) {
        return repositorioEntrega.save(entrega);
    }
}
