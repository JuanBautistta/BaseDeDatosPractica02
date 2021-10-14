package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

public class Telefono {

    private int numeroDeTelefono;

    public Telefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

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
        return "Telefono [numeroDeTelefono=" + numeroDeTelefono + "]";
    }

}
