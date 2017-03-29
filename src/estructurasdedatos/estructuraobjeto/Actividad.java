/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.estructuraobjeto;

import estreucturasDeDatos.estructurasListasEnlazadas.Estado;

/**
 *
 * @author jhon_
 */
public class Actividad {
    
    private String codigo;
    private String nombre;
    private String fecha;
    private float porcentaje;
    private String responsable;
    Estado  estadoActividad;
   
    public void crearActividad(String codigo,String nombre,String fecha, float porcentaje, 
                  String responsable){
        
        this.setCodigo(codigo);
        this.nombre=nombre;
        this.fecha=fecha;
        this.porcentaje=porcentaje;
        this.responsable=responsable;
    }
    
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getFecha() {
        return fecha;
    }

  
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

   
    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

   
    public String getResponsable() {
        return responsable;
    }

 
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
       
    
}
