package com.iso.iso.entrega;

import lombok.Data;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "ENTREGA")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EstadoEntrega estadoEntrega;

    @NotNull(message = "La entrega debe tener una direccion")
    @Embedded
    private Direccion direccion;

    @NotNull(message = "La entrega debe tener un recargo")
    private Double recargo;

    @NotNull(message = "La entrega debe tener un pedido")
    @OneToOne()
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private Pedido pedido;

    @NotNull(message = "La entrega debe tener un precio total")
    @Min(value=1, message = "El precio total de la entrega debe ser mayor a 0")
    private Double precioTotal;

}
