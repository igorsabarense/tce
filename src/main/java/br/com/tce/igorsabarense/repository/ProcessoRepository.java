package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Processo;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

    List<Processo> findByPartesIn(List<Long> id);
    List<Processo> findByAssunto(String assunto);

}