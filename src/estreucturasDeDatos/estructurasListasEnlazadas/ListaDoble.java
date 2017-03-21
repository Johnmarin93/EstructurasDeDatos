/*
 * Fecha: 18/03/2017
 * Descripcion: clase Lista Doble, esta clase nos permite usar una lista para 
 * ingresar nuevos onjetos y luego listarlos, tambien insertarlos de forma
 * ordenada.
 * Autor: John Jaiber Marin Valencia 
 * Codigo:1088016327
 */
package estreucturasDeDatos.estructurasListasEnlazadas;

/**
 *
 * @author jhon_
 */
//creamos la clase  lista Doble.
public class ListaDoble {
    
    //definimos el primer nodo, y el ultimo nodo para luego ser utilizados
    //en la creacion de nuevos nodos.
    NodoListaDoble primero;
    NodoListaDoble ultimo;
    
    //Instanciamos la clase NodoListaDosble en actual
    NodoListaDoble actual = new NodoListaDoble();
    
    //iniciamos el nodo primero en null y el ultimo en null
    public ListaDoble(){
        primero = null;
        ultimo =null;  
    }
    
    //Creamos el modulo ingresar dato para los nuevos nodos, creados desde el
    //main
    public void ingresarNodo(String nombre,String Cedula, String Direccion, 
                             float estatura, int edad, String sexo, 
                             String Nacionalidad,String rh, boolean soltero){
        //Instanciamos la clase NodoListaDoble como nuevo para luego ser llamado.
        NodoListaDoble nuevo = new NodoListaDoble();
        
        //almacenamos los datos.
        nuevo.setDato(nombre, Cedula, Direccion, estatura, edad, sexo, 
                      Nacionalidad, rh, soltero);
        
        //creamos un condicional que nos permita ir creadon el nodo de acuerdo 
        //a la posicion que corresponde.
        if(primero == null){
            primero = nuevo;
            primero.setSiguiente(null);
            primero.setAnterior(null);
            ultimo = primero;
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(null);
            ultimo=nuevo;
        }
        
    }
    //Listamos los nodos.
    public void desplegarLista(){
        
        while(actual != null){
           System.out.println(actual.getDato().getCedula());
           System.out.println(actual.getDato().getNombre());
           System.out.println(actual.getDato().getDireccion());
           System.out.println(actual.getDato().getEstatura());
           System.out.println(actual.getDato().getEdad());
           System.out.println(actual.getDato().getSexo());
           actual = actual.getAnterior();
        }
    }
}

