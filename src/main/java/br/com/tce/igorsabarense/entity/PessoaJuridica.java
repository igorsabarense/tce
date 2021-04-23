package br.com.tce.igorsabarense.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "pessoa_juridica")
public class PessoaJuridica {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj", length = 14)
    private String cnpj;

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime != null ? creationDateTime : LocalDateTime.now();
    }
}


