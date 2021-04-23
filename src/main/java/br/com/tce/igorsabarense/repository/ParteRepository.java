package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Parte;
import br.com.tce.igorsabarense.entity.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParteRepository extends JpaRepository<Parte, Long> {



}