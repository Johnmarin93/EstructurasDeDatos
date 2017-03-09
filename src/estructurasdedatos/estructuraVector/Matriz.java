/*Fecha 07/03/2017
Creacion de la clase Matriz
/*utilizado para crear una matriz, buscar un dato en la matriz,
,listar,eliminarun dato, y una posicion, insertar datos en la matriz,
multiplicar matrices y encontrar la traspuesta.
*/
//Definiendo el paquete donde esta la clase 
package estructurasdedatos.estructuraVector;
/**
 * @author John Marin Valencia
 * Codigo 1088016327
 * Creamos la clase Matriz con cada uno de sus atributos
 */
public class Matriz {
    
    //Definimos los parametros filas columnas y el nombre de la matriz.
    private int filas;
    private int columnas;
    public int[][] matriz;
    
    //Definimos la funcion crear y le definimos el tamaño desde el main. 
    public void crear (int filas, int columnas)
    {   
        this.matriz = new int [filas][columnas];  
    }
    
    //Definimos la funcion llenar y le enviamos los datos desde el main .
    public void llenar(int pos1, int pos2, int num)
    {
         this.matriz[pos1][pos2]=num;
    }
    
    //Creamos la funcion que nos imprima la matriz en pantalla
    public void imprimir()
    {
         for(int i=0; i< matriz.length; i++)
         {
            for(int j=0; j< matriz.length; j++)
            {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
         }
    }
    
   //Creamos la funcion buscar, para localizar la posicion del dato en la matriz
    public int Bu (int Datos)
    {
        for(int i=1; i<matriz.length; i++)
        {
            for(int j=1; j<matriz.length; j++)
            {
                if(matriz[i][j]==Datos)
                {
                    System.out.println("El dato existe en la matriz");
                }
                else{
                    System.out.println("El dato no existe en la matriz");
                }
            }
        }
        return 0;
    }
    
  //Definimos la funcion eliminar para el dato que deseamos borrar desde el main
    public int Eliminar (int Datos)
    {
        for(int i=1; i< this.filas; i++)
        {
            for(int j=i; j< this.columnas; j++)
            {
                if(matriz[i][j]==Datos)
                { 
                    return this.matriz [i][j];    
                }
                else
                {
                    System.out.println("El dato no existe en la matriz");
                }    
            }
        }
        return 0;
    }
    
    //Creamos la funcion traspuesta para implementarla en la matriz
    public void traspuesta()
    {
         System.out.print("La matriz traspuesta es: \t\n");
         for(int i=0; i< matriz.length; i++)
         {
            for(int j=0; j< matriz.length; j++)
            {
               System.out.print(matriz[j][i]+"\t");
            }
               System.out.println();
         }
    }
   
    //Creamos la funcion para realizar la multiplicacion de dos matrices.
    public void multiplicion(int [][]mat1, int [][] mat2, int[][]mat3)
    {
        if(mat1[0].length != mat2.length)
        {
            System.out.println("No es posible realizar la multiplicacion");
         }
        else
        {
            for(int i=0; i<mat1.length; i++)
            {
                for(int j=0; j<mat2.length; j++)
                {
                    for(int s=0; s<mat2.length; s++)
                    {
                        mat3[i][j]+= mat1[i][s]*mat2[s][j];
                    }
                }
            }
        }
    }
    
    //Definimos la funcion para imprimir la matriz resultante.
    public void Imprimirmatriz(int[][] matr)
    {
        System.out.println("El resultao de la "
        + "multiplicacion de las matrices es: ");
        
        for(int i=0; i<matr.length; i++)
        {
            for(int j=0; j<matr[i].length; j++)
            {
            System.out.print(matr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
        
 
