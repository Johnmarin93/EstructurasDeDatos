/*
 * Fecha: 15/03/2017
 * Descripcion: clase Lista simple, esta clase nos permite usar una lista para 
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
//creamos la clase  lista simple.
public class Listasimple {
    
    //definimos el primer nodo, y el ultimo nodo para luego ser utilizados
    //en la creacion de nuevos nodos.
    private int dato;
    Nodo cabeza;
    Nodo cola;
    
    //Instanciamos la clase Noso como actual para ser llamada.
    Nodo actual = new Nodo();
    //Instanciamos la clase Persona para ser utilzada en la clase Simple.
    Persona persona = new Persona();
    
    
   //iniciamos el nodo primero en null y el ultimo en null
   public Listasimple(){
    cabeza=null;
    cola=null;
   }
   //Creamos el modulo ingresar dato para los nuevos nodos, creados desde el
    //main
   public void ingresarNodo(String nombre,String Cedula, String Direccion, 
                             float estatura, int edad, String sexo, 
                             String Nacionalidad,String rh, boolean soltero){
       //Instanciamos la clase Noso como actual para ser llamada.
       Nodo nodonuevo = new Nodo ();
       //almacenamos los datos.
       nodonuevo.setDato(nombre, Cedula, Direccion, estatura, edad, sexo, 
                         Nacionalidad, rh, soltero);
       
       //creamos un condicional que nos permita ir creadon el nodo de acuerdo 
        //a la posicion que corresponde.
       if(cabeza==null){
           cabeza=nodonuevo;
           cola=cabeza;
       }
       else{
           cola.setSiguiente(nodonuevo);
           cola = nodonuevo;
       }
       
      
   }
   //Listamos los nodos.
   public void listar(){
       
       actual = cabeza;
       while(actual != null){
           System.out.println(actual.getDato().getCedula());
           System.out.println(actual.getDato().getNombre());
           System.out.println(actual.getDato().getDireccion());
           System.out.println(actual.getDato().getEstatura());
           System.out.println(actual.getDato().getEdad());
           System.out.println(actual.getDato().getSexo());
           actual = actual.getSiguiente();
       }
   }
   
  
    
    
}
