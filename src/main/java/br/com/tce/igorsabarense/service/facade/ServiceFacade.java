package br.com.tce.igorsabarense.service.facade;


import br.com.tce.igorsabarense.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFacade {
    @Autowired
    public UserService user;

    @Autowired
    public AnexoService anexo;

    @Autowired
    public ProcessoService processo;



}
