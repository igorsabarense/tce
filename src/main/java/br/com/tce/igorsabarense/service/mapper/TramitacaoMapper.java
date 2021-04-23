package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.TramitacaoDTO;
import br.com.tce.igorsabarense.entity.Tramitacao;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = ProcessoMapper.class)
public interface TramitacaoMapper extends EntityMapper<TramitacaoDTO, Tramitacao> {


    TramitacaoDTO toDto(Tramitacao entity);

    Tramitacao toEntity(TramitacaoDTO dto);

    default Tramitacao fromId(Long id){
        if(id == null){
            return null;
        }
        Tramitacao tramitacao = new Tramitacao();
        tramitacao.setNumeroGuia(id);
        return tramitacao;
    }
}
