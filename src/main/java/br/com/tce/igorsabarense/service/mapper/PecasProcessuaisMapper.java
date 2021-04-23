package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.PecasProcessuaisDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.PecasProcessuais;
import br.com.tce.igorsabarense.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PecasProcessuaisMapper extends EntityMapper<PecasProcessuaisDTO, PecasProcessuais> {


    PecasProcessuaisDTO toDto(PecasProcessuais entity);

    PecasProcessuais toEntity(PecasProcessuaisDTO dto);

    default PecasProcessuais fromId(Long id){
        if(id == null){
            return null;
        }
        PecasProcessuais pecasProcessuais = new PecasProcessuais();
        pecasProcessuais.setId(id);
        return pecasProcessuais;
    }
}
