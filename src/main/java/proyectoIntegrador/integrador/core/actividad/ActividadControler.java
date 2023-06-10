package proyectoIntegrador.integrador.core.actividad;

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
@RequestMapping("api/actividad")
@CrossOrigin({"*"})
@Tag(name = "Controlador de Actividad (Tabla Actividad)")

public class ActividadControler {
    
    @Autowired 
    private ActividadService actividadService;

    //Visualizar todas las actividades
    @GetMapping("/")
    @PreAuthorize("hasAuthority('Actividad_LeerTodos')")
    @Operation(summary = "Obtiene todas las actividades, requiere el permiso Actividad_LeerTodos")
    public List<Actividad> findAll(){
        return actividadService.findAll();
    }

    //Crear actividad
    @PostMapping("/")
    @PreAuthorize("hasAuthority('Actividad_Crear')")
    @Operation(summary = "Crear actividad, requiere el permiso Actividad_Crear")
    public Actividad save(@RequestBody Actividad entity){
        return actividadService.save(entity);

    }

    //Visualizar actividad por Id
    @GetMapping("/{id}/")
    @PreAuthorize("hasAuthority('LeerActividad_Id')")
    @Operation(summary = "Visualizar actividades por su Id, requiere el permiso LeerActividad_Id")
    public Actividad findById(@PathVariable long id){
        return actividadService.findById(id);
    }

    
    //Actualizar actividad
    @PutMapping("/")
    @PreAuthorize("hasAuthority('ActualizarActividad')")
    @Operation(summary = "Actualizar actividades, requiere el permiso ActualizarActividad")
    public Actividad update(@RequestBody Actividad entity){
        return actividadService.save(entity);
    }

    //Eliminar actividad por Id
    @DeleteMapping("/{id}/")
    @PreAuthorize("hasAuthority('BorrarActividad_Id')")
    @Operation(summary = "Borrar actividades por su Id, requiere el permiso BorrarActividad_Id")
    public void deleteById(@PathVariable long id){
        actividadService.deleteById(id);
    }

}
