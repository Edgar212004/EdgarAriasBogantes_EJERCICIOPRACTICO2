package EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.controller;

import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.dao.ClienteDao;
import EdgarAriasBogantes_EJERCICIOPRACTICO2.demo.domain.Cliente;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
    
    // Inyección de dependencia del ClienteDao
    private final ClienteDao clienteDao;

    // Constructor que recibe el ClienteDao como parámetro
    public ClientesController(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    // Método que maneja las solicitudes GET para la ruta "/clientes/Clientes"
    @GetMapping("/Clientes")
    public String clientes(Model model) {
        // Obtener la lista de clientes utilizando el ClienteDao
        List<Cliente> clientesList = clienteDao.findAll();
        
        // Agregar la lista de clientes al modelo para que se pueda utilizar en la vista
        model.addAttribute("clientes", clientesList);  
        
        // Devolver el nombre de la vista que se debe mostrar (en este caso, "clientes/Clientes")
        return "clientes/Clientes";
    }
}

