package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.service;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Prereservas;
import java.util.List;
import java.util.Optional;

public interface PrereservasService {
    
    // Método para guardar una pre-reserva en la base de datos
    public Prereservas save(Prereservas prereservas);

    // Método para obtener una pre-reserva por su identificador único
    public Optional<Prereservas> get(Integer id);

    // Método para actualizar la información de una pre-reserva en la base de datos
    public void update(Prereservas prereservas);

    // Método para eliminar una pre-reserva de la base de datos por su identificador único
    public void delete(Integer id);

    // Método para obtener la lista de todas las pre-reservas en la base de datos
    public List<Prereservas> findAll();
}

