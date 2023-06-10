package proyectoIntegrador.integrador.core.linea;

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
@RequestMapping("api/linea")
@CrossOrigin({"*"})
@Tag(name = "Controlador de Linea (Tabla Linea)")

public class LineaControler {
    
    @Autowired 
    private LineaService lineaService;

    //Visualizar todas las lineas
    @GetMapping("/")
    @PreAuthorize("hasAuthority('Lineas_LeerTodos')")
    @Operation(summary = "Obtiene todas las lineas, requiere el permiso Lineas_LeerTodos")
    public List<Linea> findAll(){
        return lineaService.findAll();
    }
    //Crear Linea 
    @PostMapping("/")
    @PreAuthorize("hasAuthority('Linea_Crear')")
    @Operation(summary = "Crear una linea, requiere el permiso Linea_Crear")
    public Linea save(@RequestBody Linea entity){
        return lineaService.save(entity);

    }
    //Visualizar linea por su Id
    @GetMapping("/{id}/")
    @PreAuthorize("hasAuthority('LeerLinea_Id')")
    @Operation(summary = "Visualizar linea por su Id, requiere el permiso LeerLinea_Id")
    public Linea findById(@PathVariable long id){
        return lineaService.findById(id);
    }

    
    //Actualizar linea
    @PutMapping("/")
    @PreAuthorize("hasAuthority('ActualizarLinea')")
    @Operation(summary = "Actualizar linea, requiere el permiso ActualizarLinea")
    public Linea update(@RequestBody Linea entity){
        return lineaService.save(entity);
    }

    //Eliminar linea por su Id
    @DeleteMapping("/{id}/")
    @PreAuthorize("hasAuthority('BorrarLineaId')")
    @Operation(summary = "Borrar la linea por su Id, requiere el permiso BorrarLineaId")
    public void deleteById(@PathVariable long id){
        lineaService.deleteById(id);
    }

}
