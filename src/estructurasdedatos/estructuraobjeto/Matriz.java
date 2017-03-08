/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuraobjeto;
/**
 *
 * @author jhon_
 */
public class Matriz {
    
    private int filas;
    
    private int columnas;
    public int[][] matriz;
    
    
    public void crear (int filas, int columnas)
    {   
       
        this.matriz = new int [filas][columnas];
       
    }
    public void llenar(int pos1, int pos2, int num)
    {
         this.matriz[pos1][pos2]=num;
    }
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
        
 
