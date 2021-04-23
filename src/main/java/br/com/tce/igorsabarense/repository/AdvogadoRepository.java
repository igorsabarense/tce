package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Advogado;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvogadoRepository extends JpaRepository<Advogado, Long> {

    Advogado findByNumeroOAB(String numeroOAB);


}