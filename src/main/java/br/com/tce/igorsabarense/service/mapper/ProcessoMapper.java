package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.PeticionamentoDTO;
import br.com.tce.igorsabarense.dto.ProcessoDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        TramitacaoMapper.class,
        ParteMapper.class,
        PecasProcessuaisMapper.class,
        PeticionamentoMapper.class,
        MunicipioMapper.class
})
public interface ProcessoMapper extends EntityMapper<ProcessoDTO, Processo> {


    ProcessoDTO toDto(Processo entity);

    Processo toEntity(ProcessoDTO dto);

    default Processo fromId(Long id){
        if(id == null){
            return null;
        }
        Processo processo = new Processo();
        processo.setId(id);
        return processo;
    }
}
