package br.com.tce.igorsabarense.entity;

import br.com.tce.igorsabarense.enumeration.OcorrenciaEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "tramitacao")
public class Tramitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_guia")
    private Long numeroGuia;

    @ManyToOne
    @JoinColumn(name = "processo_id")
    @JsonIgnore
    private Processo processo;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @Column(name = "origem")
    private String origem;

    @Column(name = "destino")
    private String destino;

    @Enumerated(EnumType.STRING)
    @Column(name = "ocorrencia")
    private OcorrenciaEnum ocorrencia;

}
