package br.com.tce.igorsabarense.dto;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AnexoDTO {

    private Long id;

    private String uuidAnexo;

    private byte[] conteudo;

    private Long tamanho;

    private String nome;

    private String tipo;
}
