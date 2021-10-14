package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

public class Producto {
    
    private String nombre;
    private float precio;
    private int cantidadDeUnidades;
    private String descripcion;
    private String nombreArchivoImagen;
    private float descuento;

    public Producto(String nombre, float precio, int cantidadDeUnidades, String descripcion,
            String nombreArchivoImagen, float descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDeUnidades = cantidadDeUnidades;
        this.descripcion = descripcion;
        this.nombreArchivoImagen = nombreArchivoImagen;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidadDeUnidades() {
        return cantidadDeUnidades;
    }

    public void setCantidadDeUnidades(int cantidadDeUnidades) {
        this.cantidadDeUnidades = cantidadDeUnidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreArchivoImagen() {
        return nombreArchivoImagen;
    }

    public void setNombreArchivoImagen(String nombreArchivoImagen) {
        this.nombreArchivoImagen = nombreArchivoImagen;
    }

    public float getDescuento() {
        return descuento;
    }

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
        return "Productos [cantidadDeUnidades=" + cantidadDeUnidades + ", descripcion=" + descripcion + ", descuento="
                + descuento + ", nombre=" + nombre + ", nombreArchivoImagen=" + nombreArchivoImagen + ", precio="
                + precio + "]";
    }

    

}
