package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class OperarArchivos extends LecturaYEscritura{

    /**
     * Constructor que solicisa un nombre de archivo.
     * @param nombreArchivo el nombre del archivo en el que se quiere leer y escribir;
     */
    public OperarArchivos(String nombreArchivo){
        super(nombreArchivo);
    }

    /**
     * Metodo que recibe una lista de tipo T, y los ecribe en el archivo especificado.
     * @param <T> El tipo de los elementos a guardar.
     * @param datos la lista de datos a guardar, cada elemento en la lista corresponde a un dato.
     * @throws IOException Excepción
     */
    public <T> void escribeOpeador(List<T> datos) throws IOException {
        StringBuilder lineaOperador = new StringBuilder();
        for (T o : datos)
            lineaOperador.append(o.toString() + "\n");
        super.escribeArchivo(lineaOperador.toString());
    }

    /**
     * Metodo que convierte un arreglo de String a un arreglo de Operadores
     * @param tipo Recibe un tipo de registro
     * @param <T> Dato parámetro
     * @return operadores -- El arreglo de operadores
     * @throws ArchivoNoExiste -- Se lanza la excepción cuando el archivo no existe
     */
    public <T> List<T> leeOperadores(Registro tipo) throws ArchivoNoExiste {
        String[] lineas = super.leeArchivo();
        ArrayList<T> operadores = new ArrayList<>();
        for (int i = 0; i < lineas.length; i++) {
            if (!lineas[i].equals("null")) {
                String[] linea = lineas[i].trim().split(",");
                T elem;
                switch (tipo) {
                    case PRODUCTO:
                        elem = null;
                        break;
                    case PROVEDOR:
                        elem = null;
                        break;
                    case CLIENTE:
                        elem = null;
                        break;
                    case CATEGORIA:
                        elem = null;
                    break;
                    default:
                        elem = null;
                        break;
                }
                operadores.add(elem);
            }
        }
        return operadores;
    }

    /**
     * Metodo que recibe una cadena y parsea los datos para crear a un Operador
     * @param cadenaOperador -- La cadena  parsear
     * @return el objeto con los datos de la cadena
     */
    private Object parseaOperador(String cadenaOperador) {
        return null;
    }

}
