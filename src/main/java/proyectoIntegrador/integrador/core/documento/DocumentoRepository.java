package proyectoIntegrador.integrador.core.documento;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepository extends CrudRepository <Documento, Long> {
    

    List<Documento> findAll();

}