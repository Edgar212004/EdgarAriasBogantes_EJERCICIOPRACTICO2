package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.service;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    
    // Método para guardar un cliente en la base de datos
    public Cliente save(Cliente cliente);

    // Método para obtener un cliente por su identificador único
    public Optional<Cliente> get(Integer id);

    // Método para actualizar la información de un cliente en la base de datos
    public void update(Cliente cliente);

    // Método para eliminar un cliente de la base de datos por su identificador único
    public void delete(Integer id);

    // Método para obtener la lista de todos los clientes en la base de datos
    public List<Cliente> findAll();
}
