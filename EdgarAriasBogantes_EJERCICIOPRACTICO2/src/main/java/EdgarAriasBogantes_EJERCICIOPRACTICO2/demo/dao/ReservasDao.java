package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository, proporciona métodos CRUD para la entidad Reservas
public interface ReservasDao extends JpaRepository<Reservas, Integer> {
    // No es necesario agregar métodos aquí, ya que JpaRepository proporciona automáticamente operaciones CRUD
    // (Create, Read, Update, Delete) basándose en la entidad Reservas.
}

