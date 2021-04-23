package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.MunicipioDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.Municipio;
import br.com.tce.igorsabarense.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MunicipioMapper extends EntityMapper<MunicipioDTO, Municipio> {

    MunicipioDTO toDto(Municipio entity);

    Municipio toEntity(MunicipioDTO dto);

    default Municipio fromId(Long id){
        if(id == null){
            return null;
        }
        Municipio municipio = new Municipio();
        municipio.setId(id);
        return municipio;
    }
}
