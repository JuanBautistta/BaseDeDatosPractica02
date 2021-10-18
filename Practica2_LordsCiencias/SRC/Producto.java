package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * Clase que modela los productos vendidos en una tienda virtual.
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Producto {
    
    private String nombre;
    private float precio;
    private int cantidadDeUnidades;
    private String descripcion;
    private String nombreArchivoImagen;
    private float descuento;

    /**
     * metodo que contruye un producto.
     * @param nombre el nombre del producto.
     * @param precio el precio del producto.
     * @param cantidadDeUnidades la catidad de unidades de dicho producto.
     * @param descripcion la descripcion del producto.
     * @param nombreArchivoImagen el nombre de la imagen del producto.
     * @param descuento el descuento del producto.
     */
    public Producto(String nombre, float precio, int cantidadDeUnidades, String descripcion,
            String nombreArchivoImagen, float descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDeUnidades = cantidadDeUnidades;
        this.descripcion = descripcion;
        this.nombreArchivoImagen = nombreArchivoImagen;
        this.descuento = descuento;
    }

    /**
     * Metodo que obtiene el nombre de un producto dado.
     * @return String que contiene el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que modifica el nombre de un producto dado.
     * @param nombre un String que contien el nuevo nombre de un producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el precio de un producto dado.
     * @return float que contiene el precio de un producto.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Metodo que modifica el precio de un producto dado.
     * @param precio un float que contien el nuevo precio de un producto.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Metodo para obtener la cantidad de unidades de un producto.
     * @return int con la cantidad de unidades de un producto.
     */
    public int getCantidadDeUnidades() {
        return cantidadDeUnidades;
    }

    /**
     * Metodo que modifica la cantidad de unidades de un producto dado.
     * @param cantidadDeUnidades un int que contiene la nueva cantidad de unidades de un producto.
     */
    public void setCantidadDeUnidades(int cantidadDeUnidades) {
        this.cantidadDeUnidades = cantidadDeUnidades;
    }

    /**
     * Metodo para obtener la descripcion de un producto.
     * @return String con la descripcion del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para modificar la descripcion de un producto dado.
     * @param descripcion un String con la nueva descripcion de un producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para obtener el nombre de archivo de imagen de un producto dado.
     * @return String con el nombre de archivo de imagen de un producto.
     */
    public String getNombreArchivoImagen() {
        return nombreArchivoImagen;
    }

    /**
     * Metodo para modificar el nombre de archivo de imagen de un producto.
     * @param nombreArchivoImagen un String con el nuevo nombre de archivo de imagen de un producto.
     */
    public void setNombreArchivoImagen(String nombreArchivoImagen) {
        this.nombreArchivoImagen = nombreArchivoImagen;
    }

    /**
     * Metodo para obtener el descuento de un producto.
     * @return float con el descuento de un producto dado.
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * Metodo para modifecar el descuento de un producto dado.
     * @param descuento un float con el nuevo descuento de un producto dado.
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cantidadDeUnidades;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + Float.floatToIntBits(descuento);
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((nombreArchivoImagen == null) ? 0 : nombreArchivoImagen.hashCode());
        result = prime * result + Float.floatToIntBits(precio);
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
        Producto other = (Producto) obj;
        if (cantidadDeUnidades != other.cantidadDeUnidades)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (Float.floatToIntBits(descuento) != Float.floatToIntBits(other.descuento))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (nombreArchivoImagen == null) {
            if (other.nombreArchivoImagen != null)
                return false;
        } else if (!nombreArchivoImagen.equals(other.nombreArchivoImagen))
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre + "," + precio + "," + cantidadDeUnidades +
            "," + descripcion + "," + nombreArchivoImagen + "," + descuento;
    }

}
