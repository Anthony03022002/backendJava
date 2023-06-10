package proyectoIntegrador.integrador.core.programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/programa")
@CrossOrigin({"*"})
@Tag(name = "Controlador de programa (Tabla programa)")
public class ProgramaControler {
    
    @Autowired 
    private ProgramaService programaService;


    //visualizar todos los programas
    @GetMapping("/")
    @PreAuthorize("hasAuthority('Programa_LeerTodos')")
    @Operation(summary = "Obtiene todos los programas, requiere el permiso Programa_LeerTodo")
    public List<Programa> findAll(){
        return programaService.findAll();
    }
    //Crear programa
    @PostMapping("/")
    @PreAuthorize("hasAuthority('Programa_Crear')")
    @Operation(summary = "Crea un programa, requiere el permiso Programa_Crear")
    public Programa save(@RequestBody Programa entity){
        return programaService.save(entity);

    }
    //visualizar programa por Id
    @GetMapping("/{id}/")
    @PreAuthorize("hasAuthority('LeerProgramaId')")
    @Operation(summary = "Leer programa por Id, requiere el permiso LeerProgramaId")
    public Programa findById(@PathVariable long id){
        return programaService.findById(id);
    }

    //Actualizar programa
    @PutMapping("/")
    @PreAuthorize("hasAuthority('ActualizarPrograma')")
    @Operation(summary = "Actualizar Programa, requiere el permiso ActualizarPrograma")
    public Programa update(@RequestBody Programa entity){
        return programaService.save(entity);
    }
    //Borrar programa por Id
    @DeleteMapping("/{id}/")
    @PreAuthorize("hasAuthority('BorrarProgramaId')")
    @Operation(summary = "Borrar programa por su Id, requiere el permiso BorrarProgramaId")
    public void deleteById(@PathVariable long id){
        programaService.deleteById(id);
    }

}
