package proyectoIntegrador.integrador.core.colaborador;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ColaboradorRepository extends CrudRepository <Colaborador, Long> {
    

    List<Colaborador> findAll();

}
