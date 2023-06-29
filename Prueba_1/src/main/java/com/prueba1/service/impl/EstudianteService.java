package com.prueba1.service.impl;
import com.prueba1.db.IEstudiantesRepository;
import com.prueba1.entities.Estudiante;
import com.prueba1.service.IEstudianteService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EstudianteService implements IEstudianteService{
    private final IEstudiantesRepository productRepository;
    public EstudianteService(IEstudiantesRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Estudiante> getAllProducts() {
        return (List<Estudiante>) this.productRepository.findAll();
    }
    public void save(Estudiante product) {
        //product.setGenero("");
        this.productRepository.save(product);
    }
    public void delete(Estudiante product) {
        this.productRepository.delete(product);
    }
}
