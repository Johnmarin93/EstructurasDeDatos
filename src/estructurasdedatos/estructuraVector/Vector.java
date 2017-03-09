/*Fecha 06/03/2017
Creacion de la clase vector
/*utilizado para buscar,listar,eliminarun dato, un vector, y una posicion 
/*insertar un dato
*/
package estructurasdedatos.estructuraVector;

/**
 *
 * john marin valencia 
 * codigo 1088016327
 */
public class Vector {
     public int tam; 
     public int [] mivector ;
    
//Definimos la funcion crear para definir el tamaño del vector
    public void crear (int tam)
    {
        this.mivector = new int [tam];    
    }

    //Definimos la funcion para insertar los datos del vector desde el main 
     public boolean insertar (int Dato, int pos)
     {
            this.mivector [pos]= Dato;
            System.out.println("Dato creado con exito");

            return true;
     }

     /*Definimos la funcion listar para mostrar en pantalla el vector con cada
     uno de sus datos de una forma recursiva*/
     public void listar()
     {
         for(int i=0; i<mivector.length; i++)
         {
             System.out.println(mivector[i]);
         }
     }
     //Definimos una funcion para localizar un dato que ingresamos desde el main
     public int encontrar (int num)
     { 
         for(int i=0; i<mivector.length; i++)
         {
             if(mivector[i]==num )
             {
               System.out.println("se encontro el dato: " 
                +mivector[i]+ " En la psociion:"+ i);
             }
         }
         return 0;
     }
     /*Funcion que de forma recursiva me identifica un dato ingresado
      en el main y lo elimina del campo del vector.*/
     public boolean eliminardato(int dato)
     {
         for(int i=0; i<mivector.length; i++)
         {
             if(mivector[i]==dato )
             {
               System.out.println("El dato fue eliminado: "+mivector[i]); 
               this.mivector [i]= 0;
             }

         }
         return true;
     }
     /*Funcion que de forma recursiva me identifica la posicion a eliminar y arma 
     de nuevo el vector.*/
     public boolean eliminarposi(int pos)
     {
         for(int i=pos-1; i<mivector.length-1; i++)
         {
               mivector[i]=mivector[i+1];
         }
         return true;
     }
 
 
}


