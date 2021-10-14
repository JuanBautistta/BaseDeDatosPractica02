package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Arrays;

public class Provedor extends Persona{
    
    private String registroFederalDeContributentes;
    private Direccion direccion;
    private Telefono[] telefonos;

    public Provedor(Nombre nombre, String fechaNacimiento, String genero, String rFC, Direccion direccion,
            Telefono[] telefonos) {
        super(nombre, fechaNacimiento, genero);
        registroFederalDeContributentes = rFC;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }
    public Provedor(String rFC, Direccion direccion, Telefono[] telefonos) {
        registroFederalDeContributentes = rFC;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }
    public String getRFC() {
        return registroFederalDeContributentes;
    }
    public void setRFC(String rFC) {
        registroFederalDeContributentes = rFC;
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
        int result = super.hashCode();
        result = prime * result + ((registroFederalDeContributentes == null) ? 0 : registroFederalDeContributentes.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + Arrays.hashCode(telefonos);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Provedor other = (Provedor) obj;
        if (registroFederalDeContributentes == null) {
            if (other.registroFederalDeContributentes != null)
                return false;
        } else if (!registroFederalDeContributentes.equals(other.registroFederalDeContributentes))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (!Arrays.equals(telefonos, other.telefonos))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Provedores [RFC=" + registroFederalDeContributentes + ", direccion=" + direccion + ", telefonos=" + Arrays.toString(telefonos)
                + "]";
    }

}
