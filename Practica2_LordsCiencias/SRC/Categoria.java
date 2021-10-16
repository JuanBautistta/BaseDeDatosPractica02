package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * Clase pra representar las diferentes categorias que maneja una tienda.
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Categoria {
    
    private String nombre;
    private String descripcion;
    private int numeroDeProductos;
    
    /**
     * Metodo para crear Categorias.
     * @param nombre el nombre de la categoria.
     * @param descripcion la descripcion de la categoria.
     * @param numeroDeProductos el numero de productos en la categoria.
     */
    public Categoria(String nombre, String descripcion, int numeroDeProductos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroDeProductos = numeroDeProductos;
    }

    /**
     * Metodo que obtiene el nombre de la categoria.
     * @return String que representa el nombre de la categoria. 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre de la categoria.
     * @param nombre un String que contiene el nuevo nombre de la categoria.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la descripcion de la categoria.
     * @return String con la descripcion de la cateforia.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para cambiar la descripcion de la categoria.
     * @param descripcion un String que contiene la nueva descripción de la categoria.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para obtener el numero de productos en una categoria.
     * @return int con el numero de productos en una categoria. 
     */
    public int getNumeroDeProductos() {
        return numeroDeProductos;
    }

    /**
     * Metodo para cambiar el numero de productos en una categoria.
     * @param numeroDeProductos un int que contiene el nuevo numero de productos en una categoria.
     */
    public void setNumeroDeProductos(int numeroDeProductos) {
        this.numeroDeProductos = numeroDeProductos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + numeroDeProductos;
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
        Categoria other = (Categoria) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (numeroDeProductos != other.numeroDeProductos)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Categoria [descripcion=" + descripcion + ", nombre=" + nombre + ", numeroDeProductos="
                + numeroDeProductos + "]";
    }

}
