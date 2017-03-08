/*Creacion de la clase vector
/*utilizado para buscar,listar,eliminarun dato, un vector, y una posicion 
/*insertar un dato
*/
package estructurasdedatos.estructuraobjeto;

/**
 *
 * john marin valencia 
 * codigo 1088016327
 */
public class Vector {
     public int tam; 
     public int [] mivector ;
    

public void crear (int tam)
{
    this.mivector = new int [tam]; 
    
}
      
 public boolean insertar (int Dato, int pos)
 {
        this.mivector [pos]= Dato;
        System.out.println("Dato creado con exito");
        
        return true;
 }
 
 public void listar()
 {
     for(int i=0; i<mivector.length; i++)
     {
         System.out.println(mivector[i]);
     }
 }
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
 public boolean eliminarposi(int pos)
 {
     for(int i=pos-1; i<mivector.length-1; i++)
     {
           mivector[i]=mivector[i+1];
     }
     return true;
 }
 
 
}


