package proyectoIntegrador.integrador.core.Colaborador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {
    // atributos: delimitador de acceso, tipo de datos, nombre del atributo
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    // crud

    // crear
    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    public Colaborador save(Colaborador entity) {
        return colaboradorRepository.save(entity);
    }

    // Read
    public Colaborador findById(long id) {
        return colaboradorRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        colaboradorRepository.deleteById(id);
    }
    public List<Colaborador> findAll(){
        return colaboradorRepository.findAll();
    }
}
