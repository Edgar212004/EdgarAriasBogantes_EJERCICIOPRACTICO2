package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository, proporciona métodos CRUD para la entidad Roles
public interface RolesDao extends JpaRepository<Roles, Integer> {
    // No es necesario agregar métodos aquí, ya que JpaRepository proporciona automáticamente operaciones CRUD
    // (Create, Read, Update, Delete) basándose en la entidad Roles.
}

