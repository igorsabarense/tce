package br.com.tce.igorsabarense.resource;

import br.com.tce.igorsabarense.dto.ProcessoDTO;
import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.Parte;
import br.com.tce.igorsabarense.entity.Processo;
import br.com.tce.igorsabarense.service.facade.Facade;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/processo")
public class ProcessoResource {

    @Autowired
    private Facade facade;

    @ApiOperation(value = "Criação de processo")
    @PostMapping
    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<Processo> createProcesso(@RequestBody ProcessoDTO processoDTO) {
        Processo processo = facade.mapperStruct.processo.toEntity(processoDTO);
        processo = facade.service.processo.save(processo);
        return new ResponseEntity<>(processo, HttpStatus.OK);
    }

    @ApiOperation(value = "Atualização de processo")
    @PutMapping
    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<Processo> updateProcesso(@RequestBody ProcessoDTO processoDTO) {
        Processo processo = facade.service.processo.findById(processoDTO.getId());
        processo = facade.service.processo.update(processo);
        return new ResponseEntity<>(processo, HttpStatus.OK);
    }

    @ApiOperation(value = "Deleção de processo")
    @DeleteMapping
    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<HttpStatus> deleteProcesso(Long id) {
        facade.service.processo.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
