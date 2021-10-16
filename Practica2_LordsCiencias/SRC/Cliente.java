package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * Clase que representa los Clientes en una tienda virtual. 
 * Esta clase hereda de la clase Persona, la cual contiene los atributos básicos
 * de los clientes y proveedores. 
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Cliente extends Persona {
    
    private Direccion direccion;
    private String correoElectronico;
    private String password;
    private String metodoDePago;
    private int puntos;
    
    /**
     * Metod para contruir un cliente de la tienda virtual.
     * @param nombre el nombre de la categoria.
     * @param fechaNacimiento la fecha de nacimiento del cliente.
     * @param genero el genero del cliente.
     * @param direccion la direccion del cliente.
     * @param cURP el curp del cliente.
     * @param correoElectronico el correo electronico del cliente con el que se dio de alta.
     * @param password la contraseña del cliente.
     * @param metodoDePago el metodo de pago del cliente.
     * @param puntos los puntos que va acumulando el cliente para obtener promociones exclusivas.
     */
    public Cliente(Nombre nombre, String fechaNacimiento, String genero, String curp, Direccion direccion,
            String correoElectronico, String password, String metodoDePago, int puntos) {
        super(nombre, fechaNacimiento, genero, curp);
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.metodoDePago = metodoDePago;
        this.puntos = puntos;
    }

    /**
     * Metodo para contruir un cliente de una tienda virtual.
     * @param direccion la direccion del cliente.
     * @param correoElectronico el correo electronico del cliente con el que se dio de alta.
     * @param password la contraseña del cliente.
     * @param metodoDePago el metodo de pago del cliente.
     * @param puntos los puntos que va acumulando el cliente para obtener promociones exclusivas.
     */
    public Cliente(Direccion direccion, String correoElectronico, String password, String metodoDePago, int puntos) {
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.metodoDePago = metodoDePago;
        this.puntos = puntos;
    }

    /**
     * Metodo para obtener la direccion de un cliente dado.
     * @return String que contiene la direccion del cliete.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Metodo para modificar la direccion de un cliente.
     * @param direccion una Direccion que contiene la nueva direccion del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para obtener el correo electronico de un cliente dado.
     * @return String con el correo del cliente.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Metodo para modificar el correo electronico de un cliente dado.
     * @param correoElectronico un String que contiene el nuevo correo electronico del cliente dado.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Metodo para obtener el password de un cliente dado.
     * @return String con el correo del cliente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo para modificar el password de un cliente dado.
     * @param password un String que contiene el nuevo password para un cliente dado.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo para obtener el metodo de pago de un cliente dado.
     * @return String con el metodo de pago del cliente.
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Metodo para modificar el metodo de pago de un cliente dado.
     * @param metodoDePago un String que conrien el nuevo metodo de pago para un cliente dado.
     */
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    /**
     * Metodo para obtener los puntos de un cliente dado.
     * @return int con el numero de puntos actuales que tiene el cliente. 
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Metodo para modificar el numero de puntos que tiene un cliente dado.
     * @param puntos un int con los nuevos puntos que va a tener el cliente.
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((correoElectronico == null) ? 0 : correoElectronico.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
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
        if (correoElectronico == null) {
            if (other.correoElectronico != null)
                return false;
        } else if (!correoElectronico.equals(other.correoElectronico))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
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
        return "Cliente [correoElectronico=" + correoElectronico + ", direccion=" + direccion + ", metodoDePago="
                + metodoDePago + ", password=" + password + ", puntos=" + puntos + "]";
    }

}
