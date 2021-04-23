package br.com.tce.igorsabarense.service.impl;

import br.com.tce.igorsabarense.entity.Anexo;
import br.com.tce.igorsabarense.service.AnexoService;
import br.com.tce.igorsabarense.service.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnexoServiceImpl implements AnexoService {

    @Autowired
    private Facade facade;

    @Override
    public Anexo findByUuidAnexo(String uuid) {
        return facade.repository.anexo.findByUuidAnexo(uuid);
    }
}
