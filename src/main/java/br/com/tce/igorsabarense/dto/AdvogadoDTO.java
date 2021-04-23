package br.com.tce.igorsabarense.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AdvogadoDTO {
    private Long id;
    private Boolean active;
    private PessoaFisicaDTO pessoaFisica;
    private String numeroOAB;
    private List<ProcessoDTO> processos;
}
