package br.com.tce.igorsabarense.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pecas_processuais")
public class PecasProcessuais {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "processo_id", nullable = false)
    @JsonIgnore
    private Processo processo;


    @Column(name = "data_arquivo")
    private LocalDateTime dataArquivo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @OneToOne
    @JoinColumn(name = "anexo_id")
    private Anexo anexo;

    public void setDataArquivo(LocalDateTime dataArquivo) {
        this.dataArquivo = dataArquivo != null ? dataArquivo : LocalDateTime.now();
    }
}
