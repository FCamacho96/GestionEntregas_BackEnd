package com.iso.iso.entrega;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Embeddable
public class Direccion {

    @NotNull(message = "Falta completar la direccion")
    private Integer lat;

    @NotNull(message = "Falta completar la direccion")
    private Integer lng;

}
