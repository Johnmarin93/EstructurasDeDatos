/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estreucturasDeDatos.estructurasListasEnlazadas;

/**
 *
 * @author jhon_
 */
    
     public class Nodopersona {
         
         private Nodopersona Dato;
         private Nodopersona siguiente = null;
    /**
     * @return the Dato
     */
    public Nodopersona getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(Nodopersona Dato) {
        this.Dato = Dato;
    }

    /**
     * @return the siguiente
     */
    public Nodopersona getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodopersona siguiente) {
        this.siguiente = siguiente;
    }
    
         
     
     
     
    
    
}
