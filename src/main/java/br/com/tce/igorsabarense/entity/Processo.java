package br.com.tce.igorsabarense.entity;



import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "processo")
public class Processo{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date_time")
    private LocalDateTime creationDateTime;

    @OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
    List<Tramitacao> tramitacao = new ArrayList<>();

    @OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
    private List<Parte> partes = new ArrayList<>();

    @OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
    private List<PecasProcessuais> pecasProcessuais = new ArrayList<>();

    @OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
    private List<Peticionamento> peticionamentos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "municipio_id")
    private Municipio municipio;

    @Column(name = "assunto")
    private String assunto;

    public void setPartes(List<Parte> partes) {
        for(Parte parte : partes){
            parte.setProcesso(this);
        }
        this.partes = partes;
    }

    public void setTramitacao(List<Tramitacao> tramitacao) {
        for(Tramitacao t : tramitacao){
            t.setProcesso(this);
        }
        this.tramitacao = tramitacao;

    }

    public void setPecasProcessuais(List<PecasProcessuais> pecasProcessuais) {
        for(PecasProcessuais pecas : pecasProcessuais){
            pecas.setProcesso(this);
        }
        this.pecasProcessuais = pecasProcessuais;
    }

    public void setPeticionamentos(List<Peticionamento> peticionamentos) {
        for(Peticionamento peticionamento : peticionamentos){
            peticionamento.setProcesso(this);
        }
        this.peticionamentos = peticionamentos;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime != null ? creationDateTime : LocalDateTime.now();
    }


}
