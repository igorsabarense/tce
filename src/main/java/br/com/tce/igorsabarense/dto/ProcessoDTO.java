package br.com.tce.igorsabarense.dto;

import br.com.tce.igorsabarense.entity.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ProcessoDTO {
    private Long id;


    private List<TramitacaoDTO> tramitacao;

    private List<ParteDTO> partes;

    private List<PecasProcessuaisDTO> pecasProcessuais;

    private List<PeticionamentoDTO> peticionamentos;

    private MunicipioDTO municipio;

    private String assunto;
}
