package br.com.tce.igorsabarense.service.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Facade {

    @Autowired
    public MapperStruct mapperStruct;

    @Autowired
    public ServiceFacade service;

    @Autowired
    public RepositoryFacade repository;

    @Autowired
    public BCryptPasswordEncoder bCryptPasswordEncoder;

}
