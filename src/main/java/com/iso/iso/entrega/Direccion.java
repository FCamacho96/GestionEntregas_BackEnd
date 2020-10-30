package com.iso.iso.entrega;

import lombok.Data;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Embeddable
public class Direccion {

    @NotBlank(message = "La direccion no debe ser un texto vacio")
    private String valor;

    @NotNull(message = "Falta completar la latitud de direccion")
    private Integer lat;

    @NotNull(message = "Falta completar la lng de direccion")
    private Integer lng;

}
