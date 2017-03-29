

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
public class Persona{
    
    private String nombre;
    private String Cedula ;
    private String Direccion;
    private float estatura;
    private int edad;
    private String sexo;
    private String Nacionalidad;
    private String rh;
    private boolean soltero; 

    //Metodo que es llamado desde el nodo para crear las personas.
    public void crearpersona(String nombre,String Cedula, String Direccion, 
                  float estatura, int edad, String sexo, String Nacionalidad,
                  String rh, boolean soltero){
        
        this.nombre=nombre;
        this.Cedula=Cedula;
        this.Direccion=Direccion;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;
        this.Nacionalidad=Nacionalidad;
        this.rh=rh;
        this.soltero=soltero;
        
    }
    /**
     * Encapsulamos la clase
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
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
    public String setCedula(String cedula) {
        this.Cedula = cedula;
        return Cedula;
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
    public String setDireccion(String direccion) {
        this.Direccion = direccion;
        return Direccion;
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