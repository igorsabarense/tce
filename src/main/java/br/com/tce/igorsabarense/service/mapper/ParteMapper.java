package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.ParteDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.Parte;
import br.com.tce.igorsabarense.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ParteMapper extends EntityMapper<ParteDTO, Parte> {

    ParteDTO toDto(Parte entity);

    Parte toEntity(ParteDTO dto);

    default Parte fromId(Long id){
        if(id == null){
            return null;
        }
        Parte parte = new Parte();
        parte.setId(id);
        return parte;
    }
}
