package proyectoIntegrador.integrador.core.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyectoIntegrador.integrador.core.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
