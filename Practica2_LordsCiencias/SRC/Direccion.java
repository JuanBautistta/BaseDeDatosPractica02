package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

public class Direccion {

    private int codigoPostal;
    private String municipio;
    private String estado;
    private String calle;
    private int numero;
    
    public Direccion(int codigoPostal, String municipio, String estado, String calle, int numero) {
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.estado = estado;
        this.calle = calle;
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

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
        return "Direccion [calle=" + calle + ", codigoPostal=" + codigoPostal + ", estado=" + estado + ", municipio="
                + municipio + ", numero=" + numero + "]";
    }
    
    

}
