/*
 * Fecha: 28/03/2017
 * Descripcion: clase Lista Circular, esta clase nos permite usar una lista para 
 * ingresar Actividades, eliminar una actividad, listar todas las actividades
 * buscar alguna actividad en especial,avanzar entre actividades que cumplan el 
 * 100% y por ultimo poder modificar el avance de las actividades.
 * Autor: John Jaiber Marin Valencia 
 * Codigo:1088016327
 */
package estreucturasDeDatos.estructurasListasEnlazadas;
/**
 *
 * @author jhon_
 */
public class ListaCircular {
    
    //CReamos los nodos y los nombres de enlaces.
     NodoActividad primero;
     NodoActividad ultimo;
    
    //Instanciamos de forma global el Nodo Actividad.
     NodoActividad actual = new NodoActividad();
    
    //Iniciamos el nodo primero en null y el ultimo en null
     public ListaCircular()
     {
       primero=null;
       ultimo=null;
     }
   
    /**Creamos el metodo ingresar dato para los nuevos nodos, creados desde el
     main*/
     public void ingresarNodo(String codigo, String nombre,String fecha,float
                              porcentaje,String responsable)
     {
       
        //Instanciamos la clase Noso como actual para ser llamada.
         NodoActividad nuevo = new NodoActividad ();
     
        //Mediante este metodo enviamos los datos para ser almacenados en la clase.
         nuevo.setDato(codigo, nombre, fecha, porcentaje, responsable);
       
        /*Creamos un condicional que nos permita ir creadon el nodo de acuerdo 
         a la posicion que corresponde.*/
         if(primero==null)
        {
           primero=nuevo;
           ultimo=primero;
           primero.siguiente =ultimo;
        }
       else
        {
           ultimo.setSiguiente(nuevo);
           nuevo.siguiente =primero;
           ultimo = nuevo; 
        }
       
      
     }
    //Creamos el metodo para listar los nodos.
     public void listar()
     {
      
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
   
    //Cramos el metodo Eliminar el cual nos permite eliminar por codig de activi
     public void Eliminar (String codigo)
     {
        NodoActividad actual = new NodoActividad();
        NodoActividad anterior = new NodoActividad();
        actual=primero;
        anterior=ultimo;
        do
        { 
           if(actual.getDato().getCodigo()==codigo)
            {
               if(actual == primero)
                {
                   primero=primero.siguiente;
                   ultimo.siguiente = primero; 
                }
                else if(actual== ultimo)
                      {
                         anterior.siguiente = ultimo.siguiente;
                         ultimo = anterior;
                      }
                   else{
                           anterior.siguiente=actual.siguiente;
                       }
            }
           anterior = actual;
           actual=actual.siguiente;
        }
        while(actual!=primero);
     }
    
    //Creamos el metodo Buscar. 
     public void Buscar(String codigo)
     {
         NodoActividad actual = new NodoActividad();
         actual = primero;
         boolean encontrar = false;
         do{
             if(actual.getDato().getCodigo()== codigo)
             {
                encontrar= true;
             }
                actual=actual.siguiente;
            }
             while(actual!= primero);
             if(encontrar == true)
             {
                System.out.println("Actividad"+": "+actual.getDato().getNombre());
             }
             else{
                   System.out.println("La actividad no existe");
                 }
     }
    
    //Creamos el Metodo Registar avance traemos el codigo de act y nuevo dato.
     public void registrarAvance (String codigo, float dato)
     {
       NodoActividad actual = new NodoActividad();
       actual = primero;
       do{
           if(actual.getDato().getCodigo()== codigo)
           {
               actual.getDato().setPorcentaje(dato);
           }
           actual= actual.siguiente;
         }
           while(actual !=primero);
     }
   
    //Creamos el metodo como condicion para avanzar en la creacion de act.
     public void avanzarActividad ()
     {
        if (actual.getDato().getPorcentaje()== 100)
        {
            System.out.println("Continua creando las actividades");
        }
        else{
               System.out.println("Debe terminar la actividad al 100%");
            }
     }    
  }
          
       
   
   
  
    
    


