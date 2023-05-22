package proyectoIntegrador.integrador.core.linea;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import proyectoIntegrador.integrador.core.programa.Programa;

@Data
@Entity

public class Linea {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private int codigo;

    @ManyToOne
    private Programa programa;
}
