package proyectoIntegrador.integrador.core.actividad;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;




@Data
@Entity

public class Actividad {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinal;


    

    
}
