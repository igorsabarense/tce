package br.com.tce.igorsabarense.service.facade;

import br.com.tce.igorsabarense.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryFacade {
    @Autowired
    public UserRepository user;

    @Autowired
    public AnexoRepository anexo;

    @Autowired
    public  AdvogadoRepository advogado;

    @Autowired
    public MunicipioRepository municipio;

    @Autowired
    public PecasProcessuaisRepository pecasProcessuais;

    @Autowired
    public PessoaFisicaRepository pessoaFisica;

    @Autowired
    public PessoaJuridicaRepository pessoaJuridica;

    @Autowired
    public PeticionamentoRepository peticionamento;

    @Autowired
    public ProcessoRepository processo;

    @Autowired
    public TramitacaoRepository tramitacao;

    @Autowired
    public RoleRepository role;

    @Autowired
    public ParteRepository parte;



}
