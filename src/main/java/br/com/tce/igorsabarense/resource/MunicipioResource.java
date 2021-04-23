package br.com.tce.igorsabarense.resource;

import br.com.tce.igorsabarense.dto.MunicipioDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.Municipio;
import br.com.tce.igorsabarense.service.facade.Facade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/municipio")
public class MunicipioResource {

    @Autowired
    private Facade facade;

    @ApiOperation(value = "Criação de municipio")
    @PostMapping
    public ResponseEntity<Municipio> createMunicipio(@RequestBody MunicipioDTO municipioDTO) {
        Municipio municipio = facade.mapperStruct.municipio.toEntity(municipioDTO);
        municipio = facade.repository.municipio.save(municipio);
        return new ResponseEntity<>(municipio, HttpStatus.OK);
    }

   
}
