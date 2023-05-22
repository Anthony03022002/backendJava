package proyectoIntegrador.integrador.core.linea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineaService {

    @Autowired
    private LineaRepository lineaRepository;
    
    //Crud
    public Linea save(Linea entity){
        return lineaRepository.save(entity);
    }

    //Read
    public Linea findById(long id){
        return lineaRepository.findById(id).orElse(null);
    }

    //Delete
    public void deleteById(long id){
        lineaRepository.deleteById(id);
    }

    public List<Linea> findAll(){
        return lineaRepository.findAll();
    }


}
