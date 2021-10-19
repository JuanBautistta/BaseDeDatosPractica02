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
                                        "código postal: ", "municipio: ", "estado: ", "calle: ", "número: ",
                                        "teléfonos: "};

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
            case 7:
                msg += "los " + atributos[i];
                break;
        }
        return msg;
    }

     /**
     * A partir de la información introducida por el usuario construimos
     * al proveedor para agregar, consultar, editar o eliminar.
     * @param info la información para contruir al proveedor.
     * @return el proveedor con el cual se va a trabajar.
     */ 
    private Provedor consulta(String[] info) {
        for (String i : info) {
            System.out.println(i);
        }
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
                    codigoPostal = Integer.parseInt(info[i]);
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
                    numero = Integer.parseInt(info[i]);
                    break;
                case 7:
                    String[] arr = info[i].split("#");
                    int[] auxiliar = new int[arr.length];
                    for (int j = 0; j < arr.length; j++) {
                        auxiliar[j] = Integer.parseInt(arr[j]);
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
        return this.consulta(this.recabaInformacion(atributos.length));
    }
    
}
