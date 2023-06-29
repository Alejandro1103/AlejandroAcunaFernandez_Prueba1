package com.prueba1.Controllers;
import com.prueba1.entities.Estudiante;
import com.prueba1.service.IEstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EstudianteController {
    private final IEstudianteService productService;
    public EstudianteController(IEstudianteService productService) {
        this.productService = productService;
    }
    @GetMapping("/product")
    public String index(Model model) {
        model.addAttribute("product", new Estudiante());
        model.addAttribute("products", this.productService.getAllProducts());
        return "product";
    }
    @PostMapping("product/save")
    public String save(@ModelAttribute("product") Estudiante estudiante) {
        this.productService.save(estudiante);
        return "redirect:/product";
    }
    @PostMapping("product/delete")
    public ResponseEntity<String> delete(@RequestBody Estudiante estudiante) {
        this.productService.delete(estudiante);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
