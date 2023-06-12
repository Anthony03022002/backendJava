package proyectoIntegrador.integrador.core.colaborador;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import proyectoIntegrador.integrador.core.actividad.Actividad;

@Data
@Entity

public class DetalleColaborador {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Actividad actividad;
    private int semanas;
    private String objetivos;
}
