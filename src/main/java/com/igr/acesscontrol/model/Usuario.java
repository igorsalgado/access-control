package com.igr.acesscontrol.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private long id;
    private String nome;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
}
