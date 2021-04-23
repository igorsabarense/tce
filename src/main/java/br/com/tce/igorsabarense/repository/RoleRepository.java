package br.com.tce.igorsabarense.repository;

import br.com.tce.igorsabarense.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long>{
    Role findByName(String userRole);
}
