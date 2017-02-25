/*

 */
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author jhon_
 */
public class Animal {
    
    
    private float peso;
    private String Raza;
    private String Color;
    private String Procedencia;
    private String tipoanimal;
    private int edad;

    /**
     * @return the Peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(float Peso) {
        this.peso = Peso;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String TiRaza) {
        this.Raza = TiRaza;
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

    /**
     * @return the Procedencia
     */
    public String getProcedencia() {
        return Procedencia;
    }

    /**
     * @param Procedencia the Procedencia to set
     */
    public void setProcedencia(String Procedencia) {
        this.Procedencia = Procedencia;
    }

    /**
     * @return the tipoanimal
     */
    public String getTipoanimal() {
        return tipoanimal;
    }

    /**
     * @param tipoanimal the tipoanimal to set
     */
    public void setTipoanimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
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
    
}
