package proyectoIntegrador.integrador.core.linea;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LineaRepository extends CrudRepository <Linea, Long> {
    

    List<Linea> findAll();

}
