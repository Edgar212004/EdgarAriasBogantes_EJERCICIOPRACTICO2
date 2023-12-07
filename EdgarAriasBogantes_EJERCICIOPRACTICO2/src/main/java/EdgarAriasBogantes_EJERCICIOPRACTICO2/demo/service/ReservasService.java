package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.service;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Reservas;
import java.util.List;
import java.util.Optional;

public interface ReservasService {
    
    // Método para guardar una reserva en la base de datos
    public Reservas save(Reservas reservas);

    // Método para obtener una reserva por su identificador único
    public Optional<Reservas> get(Integer id);

    // Método para actualizar la información de una reserva en la base de datos
    public void update(Reservas reservas);

    // Método para eliminar una reserva de la base de datos por su identificador único
    public void delete(Integer id);

    // Método para obtener la lista de todas las reservas en la base de datos
    public List<Reservas> findAll();
}
