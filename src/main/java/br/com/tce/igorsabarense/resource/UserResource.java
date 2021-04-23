package br.com.tce.igorsabarense.resource;

import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.User;
import br.com.tce.igorsabarense.entity.Role;
import br.com.tce.igorsabarense.entity.User;
import br.com.tce.igorsabarense.service.facade.Facade;
import com.google.common.collect.Sets;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private Facade facade;


    @ApiOperation(value = "Sign-up feature, after signing-up you should make a request to localhost:8080/login so you can get your bearer token")
    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@RequestBody UserDTO dto) {
        User entity = facade.mapperStruct.user.toEntity(dto);
        Role role = facade.repository.role.findByName("USER");
        entity.setRoles(Sets.newHashSet(role));
        entity.setPassword(facade.bCryptPasswordEncoder.encode(entity.getPassword()));
        facade.repository.user.save(entity);
        return ResponseEntity.ok(dto.getUsername().concat(" created!"));
    }

    @ApiOperation(value = "User Update")
    @PutMapping(value = "/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") Long id , @RequestBody UserDTO dto) {

        return ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "User Deletion")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
         return ResponseEntity.notFound().build();
    }


}
