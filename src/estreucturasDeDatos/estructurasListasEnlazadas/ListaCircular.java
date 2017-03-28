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
public class ListaCircular {
    
   
    NodoActividad primero;
    NodoActividad ultimo;
    
     NodoActividad actual = new NodoActividad();
    
   //iniciamos el nodo primero en null y el ultimo en null
   public ListaCircular(){
    primero=null;
    ultimo=null;
   }
   
   //Creamos el modulo ingresar dato para los nuevos nodos, creados desde el
    //main
   public void ingresarNodo(String codigo, String nombre,String fecha,float porcentaje, 
                             String responsable){
       //Instanciamos la clase Noso como actual para ser llamada.
       NodoActividad nuevo = new NodoActividad ();
       //almacenamos los datos.
       nuevo.setDato(codigo, nombre, fecha, porcentaje, responsable);
       
       //creamos un condicional que nos permita ir creadon el nodo de acuerdo 
        //a la posicion que corresponde.
       if(primero==null){
           primero=nuevo;
           ultimo=primero;
           primero.siguiente =ultimo;
       }
       else{
           ultimo.setSiguiente(nuevo);
           nuevo.siguiente =primero;
           ultimo = nuevo; 
       }
       
      
   }
   public void listar(){
       
      
       actual=primero;
       do{
           System.out.println(actual.getDato().getCodigo());
           System.out.println(actual.getDato().getNombre());
           System.out.println(actual.getDato().getFecha());
           System.out.println(actual.getDato().getPorcentaje());
           System.out.println(actual.getDato().getResponsable());
           System.out.println("-----------------------------");
           actual=actual.getSiguiente();
       }
       while(actual != primero);
    }
   
   public void Eliminar (String codigo){
       NodoActividad actual = new NodoActividad();
       NodoActividad anterior = new NodoActividad();
       actual=primero;
       anterior=ultimo;
       do{ 
           if(actual.getDato().getCodigo()==codigo){
               if(actual == primero){
                   primero=primero.siguiente;
                   ultimo.siguiente = primero;
                   
               }else if(actual== ultimo){
                   anterior.siguiente = ultimo.siguiente;
                   ultimo = anterior;
               }else{anterior.siguiente=actual.siguiente;
           }
           }
       
           anterior = actual;
           actual=actual.siguiente;
       }while(actual!=primero);
       }
   public void Buscar(String codigo){
      NodoActividad actual = new NodoActividad();
      actual = primero;
      boolean encontrar = false;
      do{
          if(actual.getDato().getCodigo()== codigo){
              encontrar= true;
            }actual=actual.siguiente;
      }while(actual!= primero);
      if(encontrar == true){
          System.out.println("Actividad"+": "+actual.getDato().getNombre());
         }else{
          System.out.println("La actividad no existe");
      }
   }
   
   public void registrarAvance (String codigo, float dato){
       NodoActividad actual = new NodoActividad();
       actual = primero;
       do{
           if(actual.getDato().getCodigo()== codigo){
               actual.getDato().setPorcentaje(dato);
           }
           actual= actual.siguiente;
       }while(actual !=primero);
   }
       
   }
          
       
   
   
  
    
    


