package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * CLase para representar los nombres de la persona.
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Nombre {

    private String nombrePersona;
    private String apellidoP;
    private String apellidoM;
    
    /**
     * Metodo que obtiene el nombre de una persona dada.
     * @return String con el nombre.
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Metodo para modificar el nombre de una persona.
     * @param nombrePersona un String que contiene el nuevo nombre de una persona.
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     * Metodo que obtiene el apellido paterno de una persona dada.
     * @return String con el apellido paterno.
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * Metodo para modificar el apellido paterno de una persona.
     * @param apellidoP un String que contiene el nuevo apellido paterno de una persona.
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * Metodo que obtiene el apellido materno de una persona dada.
     * @return String con el apellido materno.
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * Metodo para modificar el apellido materno de una persona.
     * @param apellidoM un String que contiene el nuevo apellido materno de una persona.
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidoM == null) ? 0 : apellidoM.hashCode());
        result = prime * result + ((apellidoP == null) ? 0 : apellidoP.hashCode());
        result = prime * result + ((nombrePersona == null) ? 0 : nombrePersona.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nombre other = (Nombre) obj;
        if (apellidoM == null) {
            if (other.apellidoM != null)
                return false;
        } else if (!apellidoM.equals(other.apellidoM))
            return false;
        if (apellidoP == null) {
            if (other.apellidoP != null)
                return false;
        } else if (!apellidoP.equals(other.apellidoP))
            return false;
        if (nombrePersona == null) {
            if (other.nombrePersona != null)
                return false;
        } else if (!nombrePersona.equals(other.nombrePersona))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return this.nombrePersona + "," + this.apellidoP + "," + this.apellidoM;
    }

}
