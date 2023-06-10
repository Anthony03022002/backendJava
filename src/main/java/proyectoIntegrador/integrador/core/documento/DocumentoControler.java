package proyectoIntegrador.integrador.core.documento;

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
@RequestMapping("api/documento")
@CrossOrigin({"*"})
@Tag(name = "Controlador de Documento (Tabla Documento)")

public class DocumentoControler {
    
    @Autowired 
    private DocumentoService documentoService;

    //Visualizar todos los documentos
    @GetMapping("/")
    @PreAuthorize("hasAuthority('Documento_LeerTodos')")
    @Operation(summary = "Obtiene todos los documentos, requiere el permiso Documento_LeerTodos")
    public List<Documento> findAll(){
        return documentoService.findAll();
    }

    //Crear Documento
    @PostMapping("/")
    @PreAuthorize("hasAuthority('Documento_Crear')")
    @Operation(summary = "Crea un documento, requiere el permiso Documento_Crear")
    public Documento save(@RequestBody Documento entity){
        return documentoService.save(entity);

    }

    //Visualizar docmento por su Id
    @GetMapping("/{id}/")
    @PreAuthorize("hasAuthority('LeerDocumento_Id')")
    @Operation(summary = "Visualizar documentos por su Id, requiere el permiso LeerDocumento_Id")
    public Documento findById(@PathVariable long id){
        return documentoService.findById(id);
    }

   
    //Actualizar documento
    @PutMapping("/")
    @PreAuthorize("hasAuthority('ActualizarDocumento')")
    @Operation(summary = "Actualiza el documento, requiere el permiso ActualizarDocumento")
    public Documento update(@RequestBody Documento entity){
        return documentoService.save(entity);
    }

    //Eliminar documento por su Id
    @DeleteMapping("/{id}/")
    @PreAuthorize("hasAuthority('BorrarDocumentoId')")
    @Operation(summary = "Borar documento por su Id, requiere el permiso BorrarDocumentoId")
    public void deleteById(@PathVariable long id){
        documentoService.deleteById(id);
    }

}