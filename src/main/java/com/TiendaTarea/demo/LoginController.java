/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String showLoginPage(Model model) {
        // Se pasa el nombre de la aplicación como variable dinámica
        model.addAttribute("appName", "Mi Tienda Web");
        return "login";  // El nombre del archivo en /templates sin la extensión .html
    }
}