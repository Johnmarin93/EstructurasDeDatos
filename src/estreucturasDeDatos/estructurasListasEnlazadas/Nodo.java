/*
 * Fecha: 15/03/2017
 * Descripcion: clase Nodo, esta clase nos permite usar una lista para 
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
public class Nodo {
    //Creamos los tipos de datos
    public int Dato;
    Nodo siguiente;
    Persona persona = new Persona();
    
   
    // Encapsulamos los datos con los que definimos la clase Nodo
    public Persona getDato(){
        return persona;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public Persona setDato(String nombre, String Cedula, String Direccion,
            float estatura, int edad, String sexo, String Nacionalidad,
            String rh, boolean soltero) {
       

        persona.crearpersona(nombre, Cedula, Direccion, estatura, edad, sexo, Nacionalidad, rh, soltero);
        
        return persona;
    }

    

}
