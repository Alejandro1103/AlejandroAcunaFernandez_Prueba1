package com.prueba1.Controllers;
import com.prueba1.service.IEstudianteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final IEstudianteService productService;
    public IndexController(IEstudianteService productService) {
        this.productService = productService;
    }
    @GetMapping("/")
    public String index(Model model) {
        var productos = this.productService.getAllProducts();
        model.addAttribute("products", productos);
        return "index";
    }
}
