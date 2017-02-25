/*
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.estructuraobjeto.Persona;
import estructurasdedatos.estructuraobjeto.Vehiculo;

/**
 *
 * @author utp
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Persona juan = new Persona ();
    juan.setNombre(" Juan manuel");
    
    System.out.println("nombre:  " + juan.getNombre() + 
            " Direccion:  " + juan.getDireccion());
   
    Vehiculo Mazda = new Vehiculo ();
    Mazda.setColor(" Rojo");
    
    System.out.println("Mazda Color:  " + Mazda.getColor()) ;
    
    }
    
    
    
    
    
}
