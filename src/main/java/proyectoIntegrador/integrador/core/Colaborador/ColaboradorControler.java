package proyectoIntegrador.integrador.core.Colaborador;

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
@RequestMapping("api/colaborador")
@CrossOrigin({ " * " })
@Tag(name = "Controlador de Documento (Tabla Colaborador)")
public class ColaboradorControler {
    @Autowired
    private ColaboradorService colaboradorService;

    // method: elimitador de acceso, tipo de datos que retorna, nombre del metodo /
    // funcion
    @PostMapping("/")
    @PreAuthorize("hasAuthority('Colaborador_Crear')")
    @Operation(summary = "Crea un colaborador, requiere el permiso Colaborador_Crear")
    public Colaborador save(@RequestBody Colaborador entity) {
        return colaboradorService.save(entity);
    }

    // read
    @GetMapping("/{id}/")
    @PreAuthorize("hasAuthority('LeerColaborador_Id')")
    @Operation(summary = "Visualizar colaborador por su Id, requiere el permiso LeerColaborador_Id")
    public Colaborador findById(@PathVariable long id) {
        return colaboradorService.findById(id);
    }
    @GetMapping("/")
    @PreAuthorize("hasAuthority('Colaborador_LeerTodos')")
    @Operation(summary = "Obtiene todos los colaborador, requiere el permiso Colaborador_LeerTodos")
    public List<Colaborador> findAll() {
        return colaboradorService.findAll();
    }


    @PutMapping("/")
    @PreAuthorize("hasAuthority('ActualizarColaborador')")
    @Operation(summary = "Actualiza el Colaborador, requiere el permiso ActualizarColaborador")
    public Colaborador update( @RequestBody Colaborador entity) {
       return colaboradorService.save(entity);
    }

    @DeleteMapping("/{id}/")
    @PreAuthorize("hasAuthority('BorrarColaboradorId')")
    @Operation(summary = "Borar colaborador por su Id, requiere el permiso BorrarColaboradorId")
    public void deleteById(@PathVariable long id) {
        colaboradorService.deleteById(id);

    }

}