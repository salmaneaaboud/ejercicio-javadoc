package com.ejemplo.clases;

/**
 * La clase define el objeto Alumno y todos sus métodos
 */
public class Alumno {
    private String identificador;
    private String nombre;
    private String curso;

    /**
     * Constructor para instanciar el objeto Alumno.
     *
     * @param identificador El id del alumno.
     * @param nombre El nombre del alumno.
     * @param curso El curso en el cual está el alumno.
     */
    public Alumno(String identificador, String nombre, String curso) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.curso = curso;
    }

    /**
     * Método para matricular el alumno a un curso.
     * @param curso El curso al que se matriculará el propio alumno.
     */
    public void matricular(String curso){
        this.curso = curso + " 1";
    }

    /**
     * Método para pasar de curso al alumno.
     * Si está en el primer curso, se le asignará el siguiente número de curso.
     * En caso contrario, se marcará como titulado.
     */
    public void pasarDeCurso(){
        String[] curso = this.curso.split(" ");
        int numeroCurso = Integer.parseInt(curso[1]);
        if(numeroCurso == 1)
        {
            this.curso = curso[0] + " " + (numeroCurso + 1);
        }
        else{
            this.curso = "Titulado en " + curso[0];
        }
    }

    // Getters y Setters

    /**
     * Obtiene el id del alumno.
     * @return El id del alumno.
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define el id del alumno.
     * @param identificador El nuevo id del alumno.
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Devuelve el nombre del alumno.
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el nombre del alumno.
     * @param nombre El nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el curso al cual está matriculado el alumno.
     * @return El curso del alumno.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define el curso en el que está matriculado el alumno.
     * @param curso El nuevo curso del alumno.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
