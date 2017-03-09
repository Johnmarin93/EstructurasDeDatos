/*
 * Fecha: 23/02/2017
 * Descripcion: clase vehiculo, primera estructura de datos, segunda clase. 
*  Autor: John Jaiber Marin Valencia 
*  Codigo:1088016327
 */
/*Definiendo el paquete donde esta la clase */
package estructurasdedatos;

/**
 * @author John Marin Valencia
 * Codigo 1088016327
 * Creamos la clase Vehiculo con cada uno de sus atributos
 */
public class Vehiculo {
    private String Placa;
    private String Modelo;
    private String Soat;
    private String Color;
    

    /**
     * Encapsulamos la clase 
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String nplaca) {
        this.Placa = nplaca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Soat
     */
    public String getSoat() {
        return Soat;
    }

    /**
     * @param Soat the Soat to set
     */
    public void setSoat(String Soat) {
        this.Soat = Soat;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
}


    

