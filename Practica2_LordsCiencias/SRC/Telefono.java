package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * Clase que modela numeros de telefonos de personas.
 */
public class Telefono {

    private int numeroDeTelefono;

    /**
     * Metodo para crear numeros de telefonos.
     * @param numeroDeTelefono Número telefónico
     */
    public Telefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    /**
     * Metodo que obtiene el numero de telefono.
     * @return Entero que es el número de telefono
     */
    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    /**
     * Metodo que cambia el numero de telefono de un Telefono.
     * @param numeroDeTelefono un int con el nuevo numero de telefono.
     */
    public void setNumeroDeTelefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroDeTelefono;
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
        Telefono other = (Telefono) obj;
        if (numeroDeTelefono != other.numeroDeTelefono)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "" + numeroDeTelefono;
    }

}
