package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.PecasProcessuais;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecasProcessuaisRepository extends JpaRepository<PecasProcessuais, Long> {

    PecasProcessuais findByDescricao(String descricao);

}