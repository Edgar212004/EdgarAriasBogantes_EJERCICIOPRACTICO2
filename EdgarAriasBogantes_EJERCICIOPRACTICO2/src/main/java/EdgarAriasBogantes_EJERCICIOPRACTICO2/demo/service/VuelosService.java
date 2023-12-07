package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.service;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Vuelos;

public interface VuelosService {
// Se obtiene un Categoria, a partir del id de un categoria
    public Vuelos getCategoria(Vuelos Vuelos);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Vuelos Vuelos);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Vuelos Vuelos);
}// Fin de la clase
