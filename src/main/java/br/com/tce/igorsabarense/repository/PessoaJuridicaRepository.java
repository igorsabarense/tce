package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.PessoaFisica;
import br.com.tce.igorsabarense.entity.PessoaJuridica;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {

    PessoaJuridica findByCnpj(String cnpj);


}