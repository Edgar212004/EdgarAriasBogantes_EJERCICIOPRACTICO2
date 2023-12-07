package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    private String contrasena;
    private int id_rol;

    // Constructor vacío requerido por JPA
    public Cliente() {
    }

    // Constructor con todos los campos
    public Cliente(Integer id, String nombre, String apellido, String correo, String telefono, String nombre_usuario, String contrasena, int id_rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.id_rol = id_rol;
    }

    // Métodos getter y setter para todos los campos
    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método toString para representar la clase como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", correo=").append(correo);
        sb.append(", telefono=").append(telefono);
        sb.append(", nombre_usuario=").append(nombre_usuario);
        sb.append(", contrasena=").append(contrasena);
        sb.append(", id_rol=").append(id_rol);
        sb.append('}');
        return sb.toString();
    }
}

