package proyectoIntegrador.integrador.core.programa;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import proyectoIntegrador.integrador.core.Colaborador.Colaborador;

@Data
@Entity

public class Programa {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String carrera;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "programa_id")
    private List<Colaborador> colaboradores = new ArrayList<>();

}
