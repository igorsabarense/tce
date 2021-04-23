package br.com.tce.igorsabarense.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Table(name = "anexo")
@Data
@Entity
public class Anexo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @Column(name = "uuid", unique = true, nullable = false)
    private String uuidAnexo;

    @Column(name = "conteudo", nullable = false)
    private byte[] conteudo;

    @Column(name = "tamanho")
    private Long tamanho;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tipo")
    private String tipo;

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime != null ? creationDateTime : LocalDateTime.now();
    }

}
