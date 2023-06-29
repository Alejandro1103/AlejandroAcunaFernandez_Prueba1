package com.prueba1.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

 

    private String nombre;
    private Integer identificacion;
    private Integer nivel_cursando;
    private Integer edad;
    private float altura;
    private float peso;
    private String genero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getNivel_cursando() {
        return nivel_cursando;
    }

    public void setNivel_cursando(Integer nivel_cursando) {
        this.nivel_cursando = nivel_cursando;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
