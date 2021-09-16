package com.igr.acesscontrol.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private long id;
    private String descricao;
}
