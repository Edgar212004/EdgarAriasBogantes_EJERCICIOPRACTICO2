package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.controller;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao.PrereservasDao;
import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Prereservas;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prereservas")
public class PrereservasController {
    
    // Inyección de dependencia del PrereservasDao
    private final PrereservasDao prereservasDao;

    // Constructor que recibe el PrereservasDao como parámetro
    public PrereservasController(PrereservasDao prereservasDao) {
        this.prereservasDao = prereservasDao;
    }

    // Método que maneja las solicitudes GET para la ruta "/prereservas/Prereservas"
    @GetMapping("/Prereservas")
    public String prereservas(Model model) {
        // Obtener la lista de prereservas utilizando el PrereservasDao
        List<Prereservas> prereservasList = prereservasDao.findAll();
        
        // Agregar la lista de prereservas al modelo para que se pueda utilizar en la vista
        model.addAttribute("prereservas", prereservasList);
        
        // Devolver el nombre de la vista que se debe mostrar (en este caso, "prereservas/Prereservas")
        return "prereservas/Prereservas";
    }
}
