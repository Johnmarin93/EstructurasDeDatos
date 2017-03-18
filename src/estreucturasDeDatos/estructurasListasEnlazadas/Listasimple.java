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
public class Listasimple {
    
    Nodo cabeza;
    Nodo cola;
    Nodo actual = new Nodo();
    Persona persona = new Persona();
    private int dato;
    
   public Listasimple(){
    cabeza=null;
    cola=null;
   }
   
   public void ingresarNodo(String nombre,String Cedula, String Direccion, 
                             float estatura, int edad, String sexo, 
                             String Nacionalidad,String rh, boolean soltero){
       
       Nodo nodonuevo = new Nodo ();
       
       nodonuevo.setDato(nombre, Cedula, Direccion, estatura, edad, sexo, Nacionalidad, rh, soltero);
       if(cabeza==null){
           cabeza=nodonuevo;
           cola=cabeza;
       }
       else{
           cola.setSiguiente(nodonuevo);
           cola = nodonuevo;
       }
       
      
   }
   
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
   
  
    public void eliminar(int jhon) {
        
    

    Nodo actual, anterior;
     boolean encontrado;
     actual = cabeza; 
     anterior = null; 
     encontrado = false; 
     while ((actual != null) && (!encontrado)) 
     {  
         encontrado = (actual.Dato == dato);   
        if (!encontrado)  
        {    
            cabeza=null;    
        } 
        
    }
         
       
    }
    
}
