package com.igr.acesscontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Ocorrencia {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
}

