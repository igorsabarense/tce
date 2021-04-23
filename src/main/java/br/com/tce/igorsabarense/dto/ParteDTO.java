package br.com.tce.igorsabarense.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParteDTO {

    private Long id;

    private LocalDateTime creationDateTime;

    private PessoaFisicaDTO pessoaFisica;


    private PessoaJuridicaDTO pessoaJuridica;

    private ProcessoDTO processo;

}
