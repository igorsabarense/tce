package br.com.tce.igorsabarense.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "parte")
@Entity
public class Parte {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_fisica_id")
    private PessoaFisica pessoaFisica;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_juridica_id")
    private PessoaJuridica pessoaJuridica;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "processo_id", nullable = false)
    @JsonIgnore
    private Processo processo;

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime != null ? creationDateTime : LocalDateTime.now();
    }
}
