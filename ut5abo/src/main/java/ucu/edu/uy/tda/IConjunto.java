/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.tda;

/**
 *
 * @author nnavarro
 * @param <T>
 */
public interface IConjunto<T> extends ILista<T>
{

    /**
     *
     * @param otroConjunto
     * @return
     */
    public IConjunto<T> diferenciaSimetrica(IConjunto<T> otroConjunto);
    
}
