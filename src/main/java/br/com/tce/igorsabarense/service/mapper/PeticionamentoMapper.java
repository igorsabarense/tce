package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.PeticionamentoDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.Peticionamento;
import br.com.tce.igorsabarense.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ProcessoMapper.class)
public interface PeticionamentoMapper extends EntityMapper<PeticionamentoDTO, Peticionamento> {


    PeticionamentoDTO toDto(User entity);

    Peticionamento toEntity(UserDTO dto);

    default Peticionamento fromId(Long id){
        if(id == null){
            return null;
        }
        Peticionamento peticionamento = new Peticionamento();
        peticionamento.setId(id);
        return peticionamento;
    }
}
