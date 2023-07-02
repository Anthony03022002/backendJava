package proyectoIntegrador.integrador.core.Colaborador;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import proyectoIntegrador.integrador.core.programa.Programa;

@Data
@Entity
public class ColaboradorDetalle {
    //atributos delimitador de acceso, tipo de datos, nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;

    @ManyToOne
    private Programa programa;
    private String nombre;
    private String carrera;
}










