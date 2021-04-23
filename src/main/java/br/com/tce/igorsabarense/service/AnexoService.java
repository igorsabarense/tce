package br.com.tce.igorsabarense.service;

import br.com.tce.igorsabarense.entity.Anexo;
import org.springframework.stereotype.Service;

@Service
public interface AnexoService {
    Anexo findByUuidAnexo(String uuid);
}
