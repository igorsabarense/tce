package br.com.tce.igorsabarense.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "peticionamento")
public class Peticionamento {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @ManyToOne
    @JoinColumn(name = "processo_id")
    @JsonIgnore
    private Processo processo;


    @Column(name = "peticao_inicial")
    private String peticaoInicial;

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime != null ? creationDateTime : LocalDateTime.now();
    }
}
