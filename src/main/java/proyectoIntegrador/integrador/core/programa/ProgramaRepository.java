package proyectoIntegrador.integrador.core.programa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProgramaRepository extends CrudRepository <Programa, Long> {
    

    List<Programa> findAll();

}
