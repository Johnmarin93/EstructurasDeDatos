/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estreucturasDeDatos.estructurasListasEnlazadas;

import estructurasdedatos.estructuraobjeto.Persona;


/**
 *
 * @author jhon_
 */
public class Nodo {
    public int Dato;
    private Nodo siguiente;
    Persona persona = new Persona();
    /**
     * @return the dato
     */
   
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
