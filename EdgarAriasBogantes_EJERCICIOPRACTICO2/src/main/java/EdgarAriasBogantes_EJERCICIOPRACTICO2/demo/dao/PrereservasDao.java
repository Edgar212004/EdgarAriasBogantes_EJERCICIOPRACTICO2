package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Prereservas;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository, proporciona métodos CRUD para la entidad Prereservas
public interface PrereservasDao extends JpaRepository<Prereservas, Integer> {
    // No es necesario agregar métodos aquí, ya que JpaRepository proporciona los métodos básicos
    // CRUD (Create, Read, Update, Delete) de forma automática basándose en la entidad Prereservas.
}

