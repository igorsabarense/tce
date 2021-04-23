package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Anexo;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnexoRepository extends JpaRepository<Anexo, Long> {

    Anexo findByUuidAnexo(String uuid);

}