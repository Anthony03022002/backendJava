package proyectoIntegrador.integrador.core.actividad;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import proyectoIntegrador.integrador.core.documento.Documento;


@Data
@Entity

public class Actividad {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String actividad;
    private String estado;
    private Date fechaInicio;
    private Date fechaFinal;

    @ManyToOne
    private Documento documento;

    
}
