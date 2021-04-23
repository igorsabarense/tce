package br.com.tce.igorsabarense.resource;

import br.com.tce.igorsabarense.dto.PeticionamentoDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.Peticionamento;
import br.com.tce.igorsabarense.service.facade.Facade;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/peticionamento")
public class PeticionamentoResource {

    @Autowired
    private Facade facade;



    @PostMapping
    @Async
    public ResponseEntity<String> createPeticionamento(@RequestBody PeticionamentoDTO peticionamentoDTO) {

        return null;

    }


}
