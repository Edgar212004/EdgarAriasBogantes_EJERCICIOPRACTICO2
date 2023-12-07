package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.controller;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao.ReservasDao;
import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Reservas;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservas")
public class ReservasController {
   
    // Inyección de dependencia del ReservasDao
    private final ReservasDao reservasDao;

    // Constructor que recibe el ReservasDao como parámetro
    public ReservasController(ReservasDao reservasDao) {
        this.reservasDao = reservasDao;
    }

    // Método que maneja las solicitudes GET para la ruta "/reservas/Reservas"
    @GetMapping("/Reservas")
    public String reservas(Model model) {
        // Obtener la lista de reservas utilizando el ReservasDao
        List<Reservas> reservasList = reservasDao.findAll();
        
        // Agregar la lista de reservas al modelo para que se pueda utilizar en la vista
        model.addAttribute("reservas", reservasList);
        
        // Devolver el nombre de la vista que se debe mostrar (en este caso, "reservas/Reservas")
        return "reservas/Reservas";
    }
}

