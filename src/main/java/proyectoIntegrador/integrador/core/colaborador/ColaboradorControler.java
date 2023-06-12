package proyectoIntegrador.integrador.core.colaborador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/colaborador")
@CrossOrigin({"*"})
@Tag(name = "Controlador de colaboradores (Tabla colaborador)")

public class ColaboradorControler {
    
    @Autowired 
    private ColaboradorService colaboradorService;

    @PostMapping("/")
    public Colaborador save(@RequestBody Colaborador entity){
        return colaboradorService.save(entity);

    }

    @GetMapping("/{id}/")
    public Colaborador findById(@PathVariable long id){
        return colaboradorService.findById(id);
    }

    @GetMapping("/")
    public List<Colaborador> findAll(){
        return colaboradorService.findAll();
    }

    @PutMapping("/")
    public Colaborador update(@RequestBody Colaborador entity){
        return colaboradorService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        colaboradorService.deleteById(id);
    }

}
