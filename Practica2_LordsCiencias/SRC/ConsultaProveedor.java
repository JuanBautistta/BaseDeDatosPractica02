package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.io.*;

import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.ConsultaGen;
import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.Direccion;
import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.Provedor;
import BaseDeDatosPractica02.Practica2_LordsCiencias.SRC.Telefono;

/**
 * Clase para realizar las consultas de un producto.
 */
public class ConsultaProveedor extends ConsultaGen {

    // Atributos de un producto.
    private final String[] atributos = {"nombre: ", "Registro Federal de Contribuyentes: ",
                                        "código postal: ", "municipio: ", "estado: ", "calle: ", "número: "};

    /**
     * Generamos el mensaje para que el usuario introduzca la 
     * información que se va a agregar, consultar, editar o eliminar.
     * @param i el atributo que se va a pedir.
     */
    @Override
    public String generaMensaje(int i) {
        String msg = "Introduzca ";
        switch (i) {
            case 0:
                msg += "el " + atributos[i];
                break;
            case 1:
                msg += "el " + atributos[i];
                break;
            case 2:
                msg += "el " + atributos[i];
                break;
            case 3:
                msg += "el " + atributos[i];
                break;
            case 4:
                msg += "el " + atributos[i];
                break;
            case 5:
                msg += "la " + atributos[i];
                break;
            case 6:
                msg += "el " + atributos[i];
                break;
            default:
                msg += "el número de teléfono: ";
                break;
        }
        return msg;
    }

    /**
     * pregunta. Preguntamos al usuario sí es necesario agregar más de dos números telefónicos.
     * @param j el atributo que se va a pedir.
     * @return los números telefónicos introducidos por el usuario.
     */
    private String[] pregunta(int j) {
        String[] input = {};
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = "";
            String s = str;
            System.out.println("¿Desea agregar otro teléfono? S/N");
            while ((str = br.readLine()) != null && !(str = str.trim()).equals("N")) {
                System.out.println("Cuando desee dejar de agregar teléfonos introduzca N");
                s += str;
                System.out.println(this.generaMensaje(j));
                s += "&";
            }
            input = s.split("&");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        String[] telefonos = new String[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            telefonos[i-1] = input[i];
        }
        return telefonos;
    }

    /**
     * Recolectamos la información que va a ser utilizada para contruir el
     * objeto el cual se va a agregar, consultar, editar o eliminar.
     * @param lenght el número de atributos que se van a pedir.
     * @return la información con la que se construirá el objeto.
     */
    @Override
    public String[] recabaInformacion(int lenght) {
        String[] info = {};
        String[] telefonos = {};
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
                    telefonos = pregunta(i);
                    break; 
                }
                System.out.println(this.generaMensaje(i));
                s += "&";
            }
            info = s.split("&");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        int l = info.length;
        String[] newInfo = new String[l + telefonos.length];
        for (int i = 0; i < newInfo.length; i++) {
            if (i < l) {
                newInfo[i] = info[i];
            } else {
                newInfo[i] = telefonos[i-l];
            }
        }
        return newInfo;
    }

     /**
     * A partir de la información introducida por el usuario construimos
     * al proveedor para agregar, consultar, editar o eliminar.
     * @param info la información para contruir al proveedor.
     * @return el proveedor con el cual se va a trabajar.
     */ 
    private Provedor consulta(String[] info) {
        String nombre = "";
        String registroFederalDeContribuyentes = "";
        int codigoPostal = 0;
        String municipio = "";
        String estado = "";
        String calle = "";
        int numero = 0;
        int[] tel = {};
        for (int i = 0; i < info.length; i++) {
            switch (i) {
                case 0:
                    nombre = info[i];
                    break;
                case 1:
                    registroFederalDeContribuyentes = info[i];
                    break;
                case 2:
                    codigoPostal = this.convierteInt(info[i]);
                    break;
                case 3:
                    municipio = info[i];
                    break;
                case 4:
                    estado = info[i];
                    break;
                case 5:
                    calle = info[i];
                    break;
                case 6:
                    numero = this.convierteInt(info[i]);
                    break;
                case 7:
                    int[] auxiliar = new int[info.length - i];
                    for (int j = 0; j < auxiliar.length; j++) {
                        auxiliar[j] = this.convierteInt(info[i+j]);
                    }
                    tel = auxiliar;
                    break;
            }
        }
        Telefono[] telefonos = new Telefono[tel.length];
        for (int j = 0; j < telefonos.length; j++) {
            telefonos[j] = new Telefono(tel[j]);
        }
        Direccion dir = new Direccion(codigoPostal, municipio, estado, calle, numero);
        Provedor provedor = new Provedor(nombre, registroFederalDeContribuyentes, dir, telefonos);
        return provedor;
    }

    /**
     * Regresamos al proveedor que nos pidió agregar, consultar, editar o eliminar
     * el usuario.
     * @return producto
     */
    public Provedor get() {
        return this.consulta(this.recabaInformacion(atributos.length + 2));
    }
    
}
