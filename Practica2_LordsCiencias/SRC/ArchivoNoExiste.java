package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

/**
 * Clase Excepcion que surje cuando un archivo se intenta manipular y no existe
 * @author Ricardo Badillo Macias
 * @version 11/10/2021
*/
public class ArchivoNoExiste extends Exception {
    
    /**
     * Metodo para lanzar una exepción.
     * @param message el mensaje que contendra el excepción.
     */
    public ArchivoNoExiste(String message){
        super(message);
    }

}
