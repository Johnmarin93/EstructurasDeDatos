/*
 * main principal
 */
package estructurasdedatos;

//Importamos la ubicacion de las clases
import estructurasdedatos.estructuraobjeto.Persona;
import estructurasdedatos.estructuraVector.Vector;
import estructurasdedatos.estructuraVector.Matriz;
import estreucturasDeDatos.estructurasListasEnlazadas.Nodopersona;

/**
 *
 * John Jaiber Marin Valencia
 * Codigo 1088016327
 */
public class EstructurasDeDatos {

    public static void main(String[] args) {
   
            //Creamos la persona
            Persona juan = new Persona ();
            juan.setNombre(" Juan manuel");

            System.out.println("nombre:  " + juan.getNombre() + 
                              " Direccion:  " + juan.getDireccion());
            
            //creamos un vehiculo con la clase vehiculo
            Vehiculo Mazda = new Vehiculo ();
            Mazda.setColor(" Rojo");
            System.out.println("Mazda Color:  " + Mazda.getColor()) ;
            
            
            //definimos el vector
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
           
            //Almacenamos todas las caracteristicas de la clase matriz en mat
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
            
            /*Realizamos por medio de este llamado de la funcion 
            la traspuesta de la matriz*/
            mat.traspuesta();
            
            //Definimos las matrices y asignamos sus valores 
            int[][] mat1= {{1, 2},{2, 0}};
            int[][] matr2= {{3,3},{3, 3}};
            int[][] mat3= new int[2][2];
            
           
            Matriz mult= new Matriz();
           
            /*Realizamos la peticion de multiplicar dos matrices y enviamos
            los datos de las 2 matrices a multiplicar y el tamaño de la resultante*/
            mult.multiplicion(mat1, matr2, mat3);
            
            //Imprimimos el resultado de la multiplicacion de matrices
            mult.Imprimirmatriz(mat3);
            
            
              
             
                    
                
            
}
            
    }   
    

