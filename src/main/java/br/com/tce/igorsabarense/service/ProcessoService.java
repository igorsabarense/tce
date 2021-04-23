package br.com.tce.igorsabarense.service;

import br.com.tce.igorsabarense.entity.Processo;
import org.springframework.stereotype.Service;


public interface ProcessoService {

    Processo save(Processo processo);
    Processo update(Processo processo);
    void delete(Long id);
    Processo findById(Long id);
}
