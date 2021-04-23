package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Municipio;
import br.com.tce.igorsabarense.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long> {

   Municipio findByNome(String nome);


}