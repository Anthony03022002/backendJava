package proyectoIntegrador.integrador.core.documento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;
    
    //Crud
    public Documento save(Documento entity){
        return documentoRepository.save(entity);
    }

    //Read
    public Documento findById(long id){
        return documentoRepository.findById(id).orElse(null);
    }

    //Delete
    public void deleteById(long id){
        documentoRepository.deleteById(id);
    }

    public List<Documento> findAll(){
        return documentoRepository.findAll();
    }


}
