package br.com.tce.igorsabarense.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "municipio")
public class Municipio {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;



}
