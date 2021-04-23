package br.com.tce.igorsabarense.dto;

import br.com.tce.igorsabarense.entity.Processo;
import br.com.tce.igorsabarense.enumeration.OcorrenciaEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
public class TramitacaoDTO {


    private Long numeroGuia;

    private ProcessoDTO processo;

    private LocalDateTime creationDateTime;

    private String origem;

    private String destino;

    private OcorrenciaEnum ocorrencia;
}
