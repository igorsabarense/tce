package br.com.tce.igorsabarense.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PecasProcessuaisDTO {

    private Long id;

    private ProcessoDTO processo;

    private LocalDateTime dataArquivo;

    private String descricao;

    private AnexoDTO anexo;
}
