package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

public class Nombre {

    private String nombrePersona;
    private String apellidoP;
    private String apellidoM;

    
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
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
        return "Nombre [apellidoM=" + apellidoM + ", apellidoP=" + apellidoP + ", nombrePersona=" + nombrePersona + "]";
    }


}
