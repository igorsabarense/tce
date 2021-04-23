package br.com.tce.igorsabarense.service.facade;


import br.com.tce.igorsabarense.service.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperStruct {

    @Autowired
    public UserMapper user;

    @Autowired
    public ProcessoMapper processo;

    @Autowired
    public ParteMapper parte;

    @Autowired
    public MunicipioMapper municipio;

    @Autowired
    public TramitacaoMapper tramitacao;

    @Autowired
    public PecasProcessuaisMapper pecasProcessuais;

}
