package com.prueba1.service;
import com.prueba1.entities.Estudiante;
import java.util.List;

public interface IEstudianteService {
     List<Estudiante> getAllProducts();
      void save(Estudiante estudiante);
      void delete(Estudiante estudiante);
}
