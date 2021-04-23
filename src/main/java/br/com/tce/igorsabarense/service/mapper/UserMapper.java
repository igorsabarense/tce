package br.com.tce.igorsabarense.service.mapper;

import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {


    @Override
    @Mapping(target = "password", expression = "java(null)") // password is a sensitive info, so it is null on the dto
    UserDTO toDto(User entity);

    User toEntity(UserDTO dto);

    default User fromId(Long id){
        if(id == null){
            return null;
        }
        User user = new User();
        user.setId(id);
        return user;
    }
}
