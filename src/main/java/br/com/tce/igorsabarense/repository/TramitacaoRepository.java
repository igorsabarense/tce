package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Tramitacao;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TramitacaoRepository extends JpaRepository<Tramitacao, Long> {



}