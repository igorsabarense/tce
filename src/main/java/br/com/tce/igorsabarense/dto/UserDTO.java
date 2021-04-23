package br.com.tce.igorsabarense.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    Boolean active;
    private String username;
    private String password;
    private String name;
    private String email;
    private LocalDateTime creationDateTime;

}
