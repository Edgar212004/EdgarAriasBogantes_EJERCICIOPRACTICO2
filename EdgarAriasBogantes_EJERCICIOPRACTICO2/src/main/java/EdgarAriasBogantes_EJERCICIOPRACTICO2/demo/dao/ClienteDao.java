package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository, proporciona métodos CRUD para la entidad Cliente
public interface ClienteDao extends JpaRepository<Cliente, Integer> {
    // No es necesario agregar métodos aquí, ya que JpaRepository proporciona los métodos básicos
    // CRUD (Create, Read, Update, Delete) de forma automática basándose en la entidad Cliente.
}

