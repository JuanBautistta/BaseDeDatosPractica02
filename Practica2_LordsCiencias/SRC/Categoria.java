package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

public class Categoria {
    
    private String nombre;
    private String descripcion;
    private int numeroDeProductos;
    
    public Categoria(String nombre, String descripcion, int numeroDeProductos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroDeProductos = numeroDeProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroDeProductos() {
        return numeroDeProductos;
    }

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
