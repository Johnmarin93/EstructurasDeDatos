/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estreucturasDeDatos.estructurasListasEnlazadas;
import estructurasdedatos.estructuraobjeto.Actividad;
/**
 *
 * @author jhon_
 */
public class NodoActividad {

    Actividad dato;
    NodoActividad siguiente;
    Actividad actividad = new Actividad();
    
    
    public Actividad getDato() {
        return actividad;
    }

   
   
    public Actividad setDato(String codigo, String nombre,String fecha,float porcentaje, 
                             String responsable){
        
      
         
         actividad.crearActividad(codigo, nombre, fecha, porcentaje, responsable);
         return actividad;
    }

   
    public NodoActividad getSiguiente() {
        return siguiente;
    }

  
    public void setSiguiente(NodoActividad siguiente) {
        this.siguiente = siguiente;
    }
     
}
