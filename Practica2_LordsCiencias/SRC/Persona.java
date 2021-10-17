package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * CLase para representar los atributos basicos de las personas.
 * @author Juan Carlos Bautista Sandoval
 * @version 1.0.0
 * @since 14-10-21
 */
public class Persona {

    private Nombre nombre;
    private String fechaNacimiento;
    private String genero;
    private String CURP;

    /**
     * Metodo para contruir Personas.
     * @param nombre el nombre de la persona.
     * @param fechaNacimiento la fecha de nacimiento de la persona.
     * @param genero el genero de la persona.
     * @param curp el curp de la persona.
     */
    public Persona(Nombre nombre, String fechaNacimiento, String genero, String curp) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.CURP = curp;
    }

    /**
     * Metodo contructor por omision que construye personas.
     */
    public Persona(){
    }

    /**
     * Metodo que obtiene el nombre de una persona.
     * @return Nombre con el nombre de la persona.
     */
    public Nombre getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre de una persona.
     * @param nombre un Nombre que contiene el nuevo nombre de la persona.
     */
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la fecha de nacimiento de una persona.
     * @return String con la fecha de nacimiento.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo para modificar la fecha de nacimiento de una persona.
     * @param fechaNacimiento un String que contiene la nueva fecha de nacimiento.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo que obtiene el genero de una persona.
     * @return String con el nombre de la persona.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Metodo para modificar el genero de una persona.
     * @param genero un String que contiene el nuevo genero de la persona.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCURP() {
        return CURP;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CURP == null) ? 0 : CURP.hashCode());
        result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Persona other = (Persona) obj;
        if (CURP == null) {
            if (other.CURP != null)
                return false;
        } else if (!CURP.equals(other.CURP))
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        } else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Persona [CURP=" + CURP + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", nombre="
                + nombre + "]";
    }

}
