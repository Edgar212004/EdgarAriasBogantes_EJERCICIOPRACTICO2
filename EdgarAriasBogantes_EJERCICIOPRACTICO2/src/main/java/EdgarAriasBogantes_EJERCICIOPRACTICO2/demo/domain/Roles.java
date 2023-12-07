package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id; // Identificador único del rol
    private String nombre; // Nombre del rol

    // Constructor vacío requerido por JPA
    public Roles() {
    }

    // Constructor con todos los campos
    public Roles(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Métodos getter y setter para todos los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Método toString para representar la clase como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Roles{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
}

