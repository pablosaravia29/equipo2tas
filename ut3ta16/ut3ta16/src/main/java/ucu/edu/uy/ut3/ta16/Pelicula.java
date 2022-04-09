/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;


/**
 *
 * @author nnavarro
 */
public class Pelicula
{

    private int id;
    private String nombre;
    private int anio;
    private int score;
    private String genero;
    private String idiomaOriginal;

    public Pelicula()
    {
    }

    public Pelicula(int id, String nombre, int anio, int score, String genero, String idiomaOriginal)
    {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.score = score;
        this.genero = genero;
        this.idiomaOriginal = idiomaOriginal;
    }

    

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getAnio()
    {
        return anio;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getIdiomaOriginal()
    {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal)
    {
        this.idiomaOriginal = idiomaOriginal;
    }

    

}
