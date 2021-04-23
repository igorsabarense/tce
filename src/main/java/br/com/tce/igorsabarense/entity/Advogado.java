package br.com.tce.igorsabarense.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "advogado")
public class Advogado {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name="pessoa_fisica_id")
    private PessoaFisica pessoaFisica;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @Column(name = "numero_OAB", unique = true, nullable = false)
    private String numeroOAB;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "advogados_processos",
            joinColumns = @JoinColumn(name = "advogado_id"),
            inverseJoinColumns = @JoinColumn(name = "processo_id")
    )
    private List<Processo> processos;

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime != null ? creationDateTime : LocalDateTime.now();
    }
}
