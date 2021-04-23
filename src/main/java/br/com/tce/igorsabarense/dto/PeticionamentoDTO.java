package br.com.tce.igorsabarense.dto;

import br.com.tce.igorsabarense.entity.Processo;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PeticionamentoDTO {
    private Long id;

    private ProcessoDTO processo;

    private String peticaoInicial;
}
