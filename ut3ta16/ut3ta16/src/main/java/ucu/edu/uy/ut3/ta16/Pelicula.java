/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

import ucu.edu.uy.tda.*;

/**
 *
 * @author nnavarro
 */
public class Pelicula {

    private int id;
    private String nombre;
    private int anio;
    private int score;
    private String genero;
    private String idiomaOriginal;
    private ILista<Participante> listaParticipantes;

    public Pelicula() {
    }

    public Pelicula(int id, String nombre, int anio, int score, String genero, String idiomaOriginal) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.score = score;
        this.genero = genero;
        this.idiomaOriginal = idiomaOriginal;
        this.listaParticipantes = new Lista<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public ILista<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ILista<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }
    
    
  
    
    public void imprimir(){
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Año: " + this.anio);
        System.out.println("Score: " + this.score);
        System.out.println("Genero: " + this.genero);
        System.out.println("Idioma original: " + this.idiomaOriginal);
        System.out.println("Lista de participantes: " + this.listaParticipantes.imprimir());
    }
}
