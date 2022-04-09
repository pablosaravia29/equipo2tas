/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

/**
 *
 * @author nnavarro
 */
public class Participante
{
    private int id;
    private String nombre;

    public Participante(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
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
    
    
}
