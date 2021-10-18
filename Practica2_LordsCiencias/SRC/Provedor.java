package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Arrays;

/**
 * Clase para representar a los provedores de una persona.
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Provedor {

    private String nombre;
    private String registroFederalDeContributentes;
    private Direccion direccion;
    private Telefono[] telefonos;

    /**
    * Constructor de la clase proveedor
    */  
    public Provedor(String nombre, String registroFederalDeContributentes, Direccion direccion, Telefono[] telefonos) {
        this.nombre = nombre;
        this.registroFederalDeContributentes = registroFederalDeContributentes;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegistroFederalDeContributentes() {
        return registroFederalDeContributentes;
    }

    public void setRegistroFederalDeContributentes(String registroFederalDeContributentes) {
        this.registroFederalDeContributentes = registroFederalDeContributentes;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Telefono[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Telefono[] telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result
                + ((registroFederalDeContributentes == null) ? 0 : registroFederalDeContributentes.hashCode());
        result = prime * result + Arrays.hashCode(telefonos);
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
        Provedor other = (Provedor) obj;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (registroFederalDeContributentes == null) {
            if (other.registroFederalDeContributentes != null)
                return false;
        } else if (!registroFederalDeContributentes.equals(other.registroFederalDeContributentes))
            return false;
        if (!Arrays.equals(telefonos, other.telefonos))
            return false;
        return true;
    }

    private String toStringTelefonos() {
        String str = "";
        for (int i = 0; i < this.telefonos.length; i++) {
            if (i > 0) {
                str += "#" + Integer.toString(this.telefonos[i]);
            } else {
                str += Integer.toString(this.telefonos[i]);
            }
        }
        return str;
    }

    @Override
    public String toString() {
        return this.direccion.toString() + "," + this.nombre + "," + this.registroFederalDeContributentes + "," + this.toStringTelefonos();
    }

}
