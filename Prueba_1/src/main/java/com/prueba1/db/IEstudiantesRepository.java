package com.prueba1.db;
import com.prueba1.entities.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface IEstudiantesRepository extends CrudRepository<Estudiante, Integer> {
    
}
