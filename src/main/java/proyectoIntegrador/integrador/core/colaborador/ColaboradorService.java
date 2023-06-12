package proyectoIntegrador.integrador.core.colaborador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;
    
    //Crud
    public Colaborador save(Colaborador entity){
        return colaboradorRepository.save(entity);
    }

    //Read
    public Colaborador findById(long id){
        return colaboradorRepository.findById(id).orElse(null);
    }

    //Delete
    public void deleteById(long id){
        colaboradorRepository.deleteById(id);
    }

    public List<Colaborador> findAll(){
        return colaboradorRepository.findAll();
    }


}
