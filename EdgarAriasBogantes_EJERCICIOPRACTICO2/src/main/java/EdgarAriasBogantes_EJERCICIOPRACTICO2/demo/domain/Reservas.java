package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "reserva")
public class Reservas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private int id_vuelo;
    private int id_cliente;
    private Date fecha_reserva;

    // Constructor vacío requerido por JPA
    public Reservas() {
    }

    // Constructor con todos los campos
    public Reservas(Integer id, int id_vuelo, int id_cliente, Date fecha_reserva) {
        this.id = id;
        this.id_vuelo = id_vuelo;
        this.id_cliente = id_cliente;
        this.fecha_reserva = fecha_reserva;
    }

    // Métodos getter y setter para todos los campos
    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    // Método toString para representar la clase como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservas{");
        sb.append("id=").append(id);
        sb.append(", id_vuelo=").append(id_vuelo);
        sb.append(", id_cliente=").append(id_cliente);
        sb.append(", fecha_reserva=").append(fecha_reserva);
        sb.append('}');
        return sb.toString();
    }
}

