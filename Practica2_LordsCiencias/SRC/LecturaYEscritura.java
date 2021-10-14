package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que que permite leer y escribir a un archivo
 * @author Ricardo Badillo MAcias
 */
public class LecturaYEscritura {
    
    protected File file;
    
    /**
     * Constructor por parametros
     * @param nombreArchivo -- el NombredelArchivo que se creara
     */
    public LecturaYEscritura(String nombreArchivo) {
	file = new File(nombreArchivo);
    }

    /**
     * Metodo que escribe la información en file (archivo a modificar)
     * @param linea -- La información a escribir
     * @throws IOException
     */
    public void escribeArchivo(String linea){
        FileWriter filew; //Objeto para escribir el archivo
        try{
            filew = new FileWriter(file); //Inicializamos para escribir en FILE
            filew.write(linea); //Escribimos en el objeto
            filew.close(); //Cerramos
        }catch (IOException e){
            System.out.println(e.getMessage());
        } 

    }
    /**
     * Metodo que leeArchivo utilizando Scanner
     * Lee el contenido del file y lo convierte en un arreglo de lineas
     * @return String[] -- contiene como elemento cada linea del archivo
     * @throws ArchivoNoExiste -- Excepcion que sale cuando el archivo no se ha a creado
     */
    public String[] leeArchivo() throws ArchivoNoExiste{		
    StringBuilder bld = new StringBuilder();
	try {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            bld.append(input.nextLine() + "|");
        }
        input.close();
    } catch (FileNotFoundException e) {
        throw new ArchivoNoExiste("No hay datos que se puedan leer");
	}
	return bld.toString().split("\\|");
    }

}