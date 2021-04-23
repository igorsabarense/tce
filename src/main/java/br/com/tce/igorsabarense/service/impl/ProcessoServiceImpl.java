package br.com.tce.igorsabarense.service.impl;

import br.com.tce.igorsabarense.entity.Parte;
import br.com.tce.igorsabarense.entity.PessoaFisica;
import br.com.tce.igorsabarense.entity.PessoaJuridica;
import br.com.tce.igorsabarense.entity.Processo;
import br.com.tce.igorsabarense.service.ProcessoService;
import br.com.tce.igorsabarense.service.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessoServiceImpl implements ProcessoService {

    @Autowired
    private Facade facade;


    @Override
    public Processo save(Processo processo) {
       return facade.repository.processo.save(processo);

    }

    @Override
    public Processo update(Processo processo) {
        return save(processo);
    }

    @Override
    public void delete(Long id) {
        facade.repository.processo.deleteById(id);
    }

    @Override
    public Processo findById(Long id) {
        return facade.repository.processo.findById(id).get();
    }
}
