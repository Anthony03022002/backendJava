package proyectoIntegrador.integrador.core.Colaborador;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import proyectoIntegrador.integrador.core.linea.Linea;

@Data
@Entity
public class Colaborador {
    //atributos delimitador de acceso, tipo de datos, nombre del atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String rol;

    @ManyToOne
    private Linea linea;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="colaborador_id")
    private List<ColaboradorDetalle> detalle = new ArrayList<>(); 
    
    
}