/*
 * Fecha: 18/03/2017
 * Descripcion: clase NodoListaSimple, esta clase nos permite usar una lista para 
 * ingresar nuevos onjetos y luego listarlos, tambien insertarlos de forma
 * ordenada.
 * Autor: John Jaiber Marin Valencia 
 * Codigo:1088016327
 */
package estreucturasDeDatos.estructurasListasEnlazadas;

import estructurasdedatos.estructuraobjeto.Persona;

/**
 *
 * @author jhon_
 */
public class NodoListaDoble {
  //Creamos los tipos de datos
  private int Dato;
  private NodoListaDoble siguiente;
  private NodoListaDoble anterior;
  
  //Instanciamos la clase persona para luego ser utilizada.
  Persona persona = new Persona();
   
// Encapsulamos los datos con los que definimos la clase Nodo
    public Persona getDato() {
        return persona;
    }

    
    public Persona setDato(String nombre, String Cedula, String Direccion,
            float estatura, int edad, String sexo, String Nacionalidad,
            String rh, boolean soltero) {
       

        persona.crearpersona(nombre, Cedula, Direccion, estatura, edad, sexo, Nacionalidad, rh, soltero);
        
        return persona;
    }
    

    /**
     * @return the siguiente
     */
    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoListaDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }

}