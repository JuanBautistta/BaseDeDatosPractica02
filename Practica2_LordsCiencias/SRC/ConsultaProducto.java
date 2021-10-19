package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.ConsultaGen;
import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.Producto;

/**
 * Clase para realizar las consultas de un producto.
 */
public class ConsultaProducto extends ConsultaGen {

    // Atributos de un producto.
    private final String[] atributos = {"nombre: ", "precio: ", "cantidad de unidades: ",
                                        "descripción: ", "imagen: ", "descuento: "};

    /**
     * Generamos el mensaje para que el usuario introduzca la 
     * información que se va a agregar, consultar, editar o eliminar.
     * @param i el atributo que se va a pedir.
     */
    @Override
    public String generaMensaje(int i) {
        boolean flag = false;
        if (i == 2 || i == 3 || i == 4) {
            flag = true;
        }
        String msg = "Introduzca ";
        if (flag) {
            msg += "la ";
        } else {
            msg += "el ";
        }
        msg += atributos[i];
        return msg;
    }

    /**
     * A partir de la información introducida por el usuario construimos
     * el producto para agregar, consultar, editar o eliminar.
     * @param info la información para contruir el producto
     * @return el producto con el cual se va a trabajar.
     */
    private Producto consulta(String[] info) {
        String nombre = "";
        float precio = 0;
        int cantidadDeUnidades = 0;
        String descripcion = "";
        String nombreArchivoImagen = "";
        float descuento = 0;
        for (int i = 0; i < info.length; i++) {
            switch (i) {
                case 0:
                    nombre = info[i];
                    break;
                case 1:
                    precio = Float.parseFloat(info[i]);
                    break;
                case 2:
                    cantidadDeUnidades = Integer.parseInt(info[i]);
                    break;
                case 3:
                    descripcion = info[i];
                    break;
                case 4:
                    nombreArchivoImagen = info[i];
                    break;
                case 5:
                    descuento = Float.parseFloat(info[i]);
                    break;
            }
        }
        Producto producto = new Producto(nombre, precio, cantidadDeUnidades, descripcion, nombreArchivoImagen, descuento);
        return producto;
    }

    /**
     * Regresamos el producto que nos pidió agregar, consultar, editar o eliminar
     * el usuario.
     * @return producto
     */
    public Producto get() {
        Producto producto = this.consulta(this.recabaInformacion(atributos.length));
        return producto;
    }


}
