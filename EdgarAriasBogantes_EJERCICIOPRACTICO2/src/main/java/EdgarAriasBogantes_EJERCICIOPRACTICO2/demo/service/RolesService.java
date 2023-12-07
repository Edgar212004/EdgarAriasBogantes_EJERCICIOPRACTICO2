package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.service;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Roles;
import java.util.List;
import java.util.Optional;

public interface RolesService {
    
    // Método para guardar un rol en la base de datos
    public Roles save(Roles roles);

    // Método para obtener un rol por su identificador único
    public Optional<Roles> get(Integer id);

    // Método para actualizar la información de un rol en la base de datos
    public void update(Roles roles);

    // Método para eliminar un rol de la base de datos por su identificador único
    public void delete(Integer id);

    // Método para obtener la lista de todos los roles en la base de datos
    public List<Roles> findAll();
}


