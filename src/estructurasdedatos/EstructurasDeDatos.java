/*
 * main principal
 */
package estructurasdedatos;

//Importamos la ubicacion de las clases
import estreucturasDeDatos.estructurasListasEnlazadas.ListaCircular;
import estreucturasDeDatos.estructurasListasEnlazadas.ListaDoble;
import estreucturasDeDatos.estructurasListasEnlazadas.ListaSimple;
import estructurasdedatos.estructuraVector.Matriz;
import estructurasdedatos.estructuraVector.Vector;



/**
 *
 * John Jaiber Marin Valencia
 * Codigo 1088016327
 */
public class EstructurasDeDatos {

    public static void main(String[] args) {
   
        
        /*
         * LISTA CIRCULAR.
         */
       
        // Instanciamos la clase ListaCircular.
         ListaCircular Lc = new ListaCircular();
        
        //Realizamos el llenado del NodoActividad. 
         Lc.ingresarNodo("1234", "Analisis", "12/10/11" ,10, "john marin");
       
        /**
         * Llamamos la funcion avanzar actividad, validando el porcentaje 
         * de avance. 
         */
       
         Lc.avanzarActividad();
         
        //Continuamos ingresando Datos al Nodo Avtividad. 
         Lc.ingresarNodo("5678","Desarrollo", "12/11/11" ,100, "john marin");
         Lc.ingresarNodo("91011","Implementacion", "12/12/11" ,50, "john marin");
        
        //Listamos los Nodos.
         Lc.listar();
        
        //Podemos eliminar un nodo con el codigo de la actividad.
         Lc.Eliminar("1234");
          
        //Listamos de nuevo para ver los nodos actualizados.
         Lc.listar();
        
        //Utilizamos esta funcion para ubicar alguna actividad por su codigo. 
         Lc.Buscar("5678");
         
        /*Podemos modificar el avance de la actividad, enviamos el codigo 
         *y el valor a modificar
        */
       
         Lc.registrarAvance("5678", 90);
         
        //Listamos de nuevo para ver la informacion actualizada en el nodo.
         Lc.listar();
         
        /**----------------------------------------------------------------
         * LISTAS SIMPLES
         */
        
        //Instanciamos la lista Simple
         ListaSimple l = new ListaSimple();
           
        // Ingrsamos los datos de los NodosPeronas
         l.ingresarNodo("jhon marin", "1088016327", "Mz 8 casa 6 B ", 170, 16, 
                        "M", "Colombiana", "o+", false);
         l.ingresarNodo("jhon marin", "108801637", "Mz 8 casa 6 B ", 170, 16, 
                        "M", "Colombiana", "o+", false);
      
        
        //Mediante este metodo podemos eliminar un nodo con el N° de cedula.
         l.eliminarNdo("1088016327");
         
        //Metodo listar para actualizar la informacion en pantalla.
         l.listar();
         
        /**
        * LISTAS DOBLES 
        */
   
        //Instanciamos la lista Doble
         ListaDoble ld = new ListaDoble();
         
        //Ingresamos los datos del Nodo 
         ld.ingresarNodo("jhon marin", "1088016327", "Mz 8 casa 6 B ", 170, 16,
                         "M", "Colombiana", "o+", false);
        
        // Listamos los datos de los nodos
         ld.desplegarLista();
        
        
        /**
         * ---------------------------OBJETOS---------------------------------
         */
        //Instanciamos la clase vehiculo.
         Vehiculo Mazda = new Vehiculo ();
        
        //Agregamos un color a un vehiculo.
         Mazda.setColor(" Rojo");
         
        //Imprimos el dato del vehiculo actualizado.
         System.out.println("Mazda Color:  " + Mazda.getColor()) ;
         
        /**
         * ----------------------------VECTOR----------------------------------
         */
        //Instanciamos el vector.
         Vector vect= new Vector();
           
        //Creamos un vector de 4 posiciones
         vect.crear(4);
        
        //Insertamos los datos primero el dato seguido de la posicion 
         vect.insertar(1, 0);
         vect.insertar(4, 1);
         vect.insertar(3, 2);
         vect.insertar(1, 3);
            
        //listamos el vector 
         vect.listar();
            
        //utilizamos la opcion busqueda para encontrar un dato
          vect.encontrar(5);
            
        //utilizamos la opcion eliminar para borrar un dato
         vect.eliminardato(1);
            
        //listamos de nuevo el vector para ver las modificaciones
         vect.listar();
            
        //Eliminamos una posicion del vector 
         vect.eliminarposi(1);
            
        //Listamos de nuevo el vector para ver los cambios
         vect.listar();
          
        /**
         * ---------------------------MATRIZ-----------------------------------
         */
        //Instanciamos la clase matriz
         Matriz mat = new Matriz();
           
        //Utilizaos la funcion crear para dar forma a una matriz
         mat.crear(3, 3);
            
        //Llenamos la matriz con su posicion y su valor
         mat.llenar(0, 0, 1);
         mat.llenar(0, 1, 4);
         mat.llenar(0, 2, 3);
         mat.llenar(1, 0, 5);
         mat.llenar(1, 1, 2);
         mat.llenar(1, 2, 0);
         mat.llenar(2, 0, 3);
         mat.llenar(2, 1, 4);
         mat.llenar(2, 2, 7);
            
        //Imprimimos la matriz
         mat.imprimir();
            
        // Buscamos un dato que necesitamos en la matriz
         mat.Bu(10);
            
        //Creamos una funcion eliminar para escoger un dato y borrarlo
         mat.Eliminar(10);
            
        //Imprimimos de nuevo la matriz para ver sus cambios
         mat.imprimir();
            
        /**
         * Realizamos por medio de este llamado de la funcion
         * la traspuesta de la matriz
        */
         mat.traspuesta();
            
        //Definimos las matrices y asignamos sus valores 
         int[][] mat1= {{1, 2},{2, 0}};
         int[][] matr2= {{3,3},{3, 3}};
         int[][] mat3= new int[2][2];
          
        //Instanciamos la matriz
         Matriz mult= new Matriz();
           
        //Realizamos la peticion de multiplicar dos matrices y enviamos
        //los datos de las 2 matrices a multiplicar y el tamaño de la resultante
         mult.multiplicion(mat1, matr2, mat3);
        
        //Imprimimos el resultado de la multiplicacion de matrices
         mult.Imprimirmatriz(mat3);
            
 }
}            
              
             
                    
                
            

            
       
    

