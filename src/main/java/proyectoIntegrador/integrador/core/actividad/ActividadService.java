package proyectoIntegrador.integrador.core.actividad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;
    
    //Crud
    public Actividad save(Actividad entity){
        return actividadRepository.save(entity);
    }

    //Read
    public Actividad findById(long id){
        return actividadRepository.findById(id).orElse(null);
    }

    //Delete
    public void deleteById(long id){
        actividadRepository.deleteById(id);
    }

    public List<Actividad> findAll(){
        return actividadRepository.findAll();
    }

    

}
