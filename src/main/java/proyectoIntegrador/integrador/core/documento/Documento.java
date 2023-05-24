package proyectoIntegrador.integrador.core.documento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import proyectoIntegrador.integrador.core.actividad.Actividad;

@Data
@Entity

public class Documento {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String justificacion;
    private String antecedente;

    @ManyToOne
    private Actividad actividad;

    

}
