package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * CLase para representar las direcciónes de alguna persona,tiendas,etc.
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Direccion {

    private int codigoPostal;
    private String municipio;
    private String estado;
    private String calle;
    private int numero;
    
    /**
     * Metodo para contruir direcciones.
     * @param codigoPostal de la direccion
     * @param municipio de la direccion.
     * @param estado de la direccion.
     * @param calle de la direccion.
     * @param numero de la direccion.
     */
    public Direccion(int codigoPostal, String municipio, String estado, String calle, int numero) {
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.estado = estado;
        this.calle = calle;
        this.numero = numero;
    }

    /**
     * Metodo que obtiene el codigo postal de una direccion dada.
     * @return int con el codigo postal.
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Metodo para modificar el codigo postal de una direccion dado.
     * @param codigoPostal un int que contiene el nuevo codigo postal de una direccion.
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Metodo que obtiene el municipio de una direccion dada.
     * @return String con el municipio.
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Metodo para modificar el municipio de una direccion dada.
     * @param municipio un String que contiene el nuevo municipo de una direccion.
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * Metodo que obtiene el estado de una direccion dada.
     * @return String con el estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo para modificar el estado de una direccion dada.
     * @param estado un  String que contiene el nuevo estado de una direccion.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo que obtiene la calle de una direccion dada.
     * @return String con la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Metodo para modificar la calle de una direccion dada.
     * @param calle un String que contiene la nueva calle de una direccion.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Metodo que obtiene el numero de una direccion dada.
     * @return int con el numero de la direccion.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metodo para modificar el numero de una direccion dada.
     * @param numero un int que contiene el nuevo numero de una direccion.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((calle == null) ? 0 : calle.hashCode());
        result = prime * result + codigoPostal;
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
        result = prime * result + numero;
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
        Direccion other = (Direccion) obj;
        if (calle == null) {
            if (other.calle != null)
                return false;
        } else if (!calle.equals(other.calle))
            return false;
        if (codigoPostal != other.codigoPostal)
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (municipio == null) {
            if (other.municipio != null)
                return false;
        } else if (!municipio.equals(other.municipio))
            return false;
        if (numero != other.numero)
            return false;
        return true;
    }

    @Override
    public String toString() {
        /**
         * return "Direccion [calle=" + calle + ", codigoPostal=" + codigoPostal + ", estado=" + estado + ", municipio="
             + municipio + ", numero=" + numero + "]";
         * 
         */
        return this.calle + "," + Integer.toString(this.codigoPostal) + "," + this.estado + "," + this.municipio + ","
               + Integer.toString(this.numero);
    }
    
}
