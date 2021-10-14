package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

public class Cliente extends Persona {
    
    public final String CURP;
    private String correoElectronico;
    private String password;
    private String metodoDePago;
    private int puntos;
    
    public Cliente(Nombre nombre, String fechaNacimiento, String genero, String cURP, String correoElectronico,
            String password, String metodoDePago, int puntos) {
        super(nombre, fechaNacimiento, genero);
        CURP = cURP;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.metodoDePago = metodoDePago;
        this.puntos = puntos;
    }
    public Cliente(String cURP, String correoElectronico, String password, String metodoDePago, int puntos) {
        CURP = cURP;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.metodoDePago = metodoDePago;
        this.puntos = puntos;
    }
    public String getCURP() {
        return CURP;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMetodoDePago() {
        return metodoDePago;
    }
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((CURP == null) ? 0 : CURP.hashCode());
        result = prime * result + ((correoElectronico == null) ? 0 : correoElectronico.hashCode());
        result = prime * result + ((metodoDePago == null) ? 0 : metodoDePago.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + puntos;
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
        Cliente other = (Cliente) obj;
        if (CURP == null) {
            if (other.CURP != null)
                return false;
        } else if (!CURP.equals(other.CURP))
            return false;
        if (correoElectronico == null) {
            if (other.correoElectronico != null)
                return false;
        } else if (!correoElectronico.equals(other.correoElectronico))
            return false;
        if (metodoDePago == null) {
            if (other.metodoDePago != null)
                return false;
        } else if (!metodoDePago.equals(other.metodoDePago))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (puntos != other.puntos)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cliente [CURP=" + CURP + ", correoElectronico=" + correoElectronico + ", metodoDePago=" + metodoDePago
                + ", password=" + password + ", puntos=" + puntos + "]";
    }


}
