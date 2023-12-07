package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "vuelos")
public class Vuelos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id; // Identificador único del vuelo
    private String numero_vuelo; // Número de vuelo
    private String destino; // Destino del vuelo
    private String lugar_salida; // Lugar de salida del vuelo
    private Date hora_salida; // Hora de salida del vuelo
    private Date fecha_salida; // Fecha de salida del vuelo
    private Date fecha_llegada; // Fecha de llegada del vuelo
    private String modelo_avion; // Modelo del avión utilizado

    // Constructor vacío requerido por JPA
    public Vuelos() {
    }

    // Constructor con todos los campos
    public Vuelos(Integer id, String numero_vuelo, String destino, String lugar_salida, Date hora_salida, Date fecha_salida, Date fecha_llegada, String modelo_avion) {
        this.id = id;
        this.numero_vuelo = numero_vuelo;
        this.destino = destino;
        this.lugar_salida = lugar_salida;
        this.hora_salida = hora_salida;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.modelo_avion = modelo_avion;
    }

    // Métodos getter y setter para todos los campos
    public String getModelo_avion() {
        return modelo_avion;
    }

    public void setModelo_avion(String modelo_avion) {
        this.modelo_avion = modelo_avion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    // Método toString para representar la clase como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelos{");
        sb.append("id=").append(id);
        sb.append(", numero_vuelo=").append(numero_vuelo);
        sb.append(", destino=").append(destino);
        sb.append(", lugar_salida=").append(lugar_salida);
        sb.append(", hora_salida=").append(hora_salida);
        sb.append(", fecha_salida=").append(fecha_salida);
        sb.append(", fecha_llegada=").append(fecha_llegada);
        sb.append(", modelo_avion=").append(modelo_avion);
        sb.append('}');
        return sb.toString();
    }
}

