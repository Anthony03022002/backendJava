package proyectoIntegrador.integrador.core.programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {

    @Autowired
    private ProgramaRepository programaRepository;
    
    //Crud
    public Programa save(Programa entity){
        return programaRepository.save(entity);
    }

    //Read
    public Programa findById(long id){
        return programaRepository.findById(id).orElse(null);
    }

    //Delete
    public void deleteById(long id){
        programaRepository.deleteById(id);
    }

    public List<Programa> findAll(){
        return programaRepository.findAll();
    }


}
