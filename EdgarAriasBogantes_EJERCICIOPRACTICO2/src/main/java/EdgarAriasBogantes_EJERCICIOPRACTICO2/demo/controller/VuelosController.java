package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.controller;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao.VuelosDao;
import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Vuelos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vuelos")
public class VuelosController {

    // Inyección de dependencia del VuelosDao
    private final VuelosDao vuelosDao;

    // Constructor que recibe el VuelosDao como parámetro
    public VuelosController(VuelosDao vuelosDao) {
        this.vuelosDao = vuelosDao;
    }

    // Método que maneja las solicitudes GET para la ruta "/vuelos/Vuelos"
    @GetMapping("/Vuelos")
    public String vuelos(Model model) {
        // Obtener la lista de vuelos utilizando el VuelosDao
        List<Vuelos> vuelosList = vuelosDao.findAll();
        
        // Agregar la lista de vuelos al modelo para que se pueda utilizar en la vista
        model.addAttribute("vuelos", vuelosList);
        
        // Devolver el nombre de la vista que se debe mostrar (en este caso, "vuelos/Vuelos")
        return "vuelos/Vuelos";
    }
}


