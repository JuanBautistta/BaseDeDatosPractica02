package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.IO.*;
import java.io.IOException;

import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.Producto;
import jdk.internal.perf.Perf.GetPerfAction;

public class Consulta {

    private final String[] atributos = {"nombre: ", "precio: ", "cantidad de unidades: ",
                                        "descripción: ", "imagen: ", "descuento: "};

    private Producto ConsultaProducto(String[] info) {
        String nombre;
        float precio;
        int cantidadDeUnidades;
        String descripcion;
        String nombreArchivoImagen;
        float descuento;
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


    private String generaMensaje(int i) {
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

    private String[] recabaInformacion() {
        String[] info;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = "";
            int i = 0;
            while ((str = br.readLine()) != null && !(str = str.trim()).equals("")) {
                System.out.println(this.generaMensaje(i));
                str += "#";
                i += 1;
            }
            info = str.split("#");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return info;
    }

    public Producto getProducto() {
        Producto producto = this.ConsultaProducto(this.recabaInformacion());
    }
    
}
