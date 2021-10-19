package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.io.*;

/**
 * Clase para realizar las consultas de las entidades de la compañía.
 */
public abstract class ConsultaGen {

    /**
     * Generamos el mensaje para que el usuario introduzca la 
     * información que se va a agregar, consultar, editar o eliminar.
     * @param i el atributo que se va a pedir.
     */
    public abstract String generaMensaje(int i);

    /**
     * Recolectamos la información que va a ser utilizada para contruir el
     * objeto el cual se va a agregar, consultar, editar o eliminar.
     * @param lenght el número de atributos que se van a pedir.
     * @return la información con la que se construirá el objeto.
     */
    public String[] recabaInformacion(int lenght) {
        String[] info = {};
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = "";
            String s = str;
            int i = 0;
            System.out.println(this.generaMensaje(i));
            while ((str = br.readLine()) != null && !(str = str.trim()).equals("")) {
                s += str;
                i += 1;
                if (i >= lenght) {
                    break;
                }
                System.out.println(this.generaMensaje(i));
                s += "&";
            }
            info = s.split("&");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return info;
    }

    /**
     * convierteInt. Convertimos a una cadena a un int, sí esto falla regresamos un 0.
     * @param str el número que queremos convertir.
     * @return el número convertido o 0.
     */
    public int convierteInt(String str) {
        int i = 0;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        return i;
    }

    /**
     * convierteFloat. Convertimos a una cadena a un float, sí esto falla regresamos un 0.
     * @param str el número que queremos convertir.
     * @return el número convertido o 0.
     */
    public float convierteFloat(String str) {
        float i = 0;
        try {
            i = Float.parseFloat(str);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
        return i;
    }
}
