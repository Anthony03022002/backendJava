package proyectoIntegrador.integrador.core.colaborador;

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
import proyectoIntegrador.integrador.core.programa.Programa;

@Data
@Entity

public class Colaborador {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String rol;

    @ManyToOne
    private Programa programa;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "colaborador_id")
    private List<DetalleColaborador> detalle = new ArrayList<>();

}
