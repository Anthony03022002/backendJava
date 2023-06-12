package proyectoIntegrador.integrador.core.Colaborador;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Colaborador {
    //atributos delimitador de acceso, tipo de datos, nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String rol;

    
    
}