

/*
 * Fecha: 22/02/2017
 * Descripcion: clase persona, primera estructura de datos, una clase es una 
   plantilla de donde puedo instanciar objetos de tipo persona, una instancia 
   es una variable o un lugar en la memoria del computador.
*  Autor: John Jaiber Marin Valencia 
*  Codigo:1088016327

 */ 
/*Definiendo el paquete donde esta la clase */
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author John Jaiber Marin Valencia
 */
//Firma de la clase
public class Persona {
    
    private String nombre;
    private String Cedula ;
    private String Direccion= " Cra 8 # 21 - 32 loc 1";
    private float estatura;
    private int edad;
    private String sexo;
    private String Nacionalidad;
    private String rh;
    private boolean soltero; 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the Nacionalidad
     */
    public String getNacionalidad() {
        return Nacionalidad;
    }

    /**
     * @param Nacionalidad the Nacionalidad to set
     */
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    /**
     * @return the rh
     */
    public String getRh() {
        return rh;
    }

    /**
     * @param rh the rh to set
     */
    public void setRh(String rh) {
        this.rh = rh;
    }

    /**
     * @return the soltero
     */
    public boolean isSoltero() {
        return soltero;
    }

    /**
     * @param soltero the soltero to set
     */
    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

}