package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static final String negro = "\u001B[0m";
    public static final String rojo = "\u001B[31m";

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

	  ArrayList<Categoria> operadores = new ArrayList<>();
      operadores.add(new Categoria("canica", "son grandes", 100));
      operadores.add(new Categoria("canica2", "son grandes2", 100));
      operadores.add(new Categoria("canica3", "son grandes3", 100));
      OperarArchivos archivo = new OperarArchivos("categoria.csv");
      GestionTienda gestor = new GestionTienda();
      gestor.gestionarTienda();
      

            /*
            System.out.println("\t1-Agregar Operador\n" + "\t2-Ver Operadores\n"
            + "\t3-Editar Operador\n" + "\t4-Borrar Operador\n" + "\t5-Salir\n" + "\n\tIngresa la opción deseada\n" );
            try {
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
		        input.next();
		        System.out.println("Ingresa un número como opción");
            }
            if (opcion > 0 && opcion < 6) {
                switch (opcion) {
                    case 1:
                        System.out.println("Se agrego elem");
                        break;
                    case 2:
                        System.out.println("visualizando elem");
                        break;
                    case 3:
                        System.out.println("Editando elem");
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Guardando datos");
                        archivo.escribeOpeador(operadores);
                        bandera = false;
                        System.out.println("Datos guardados");
                        System.out.println("Saliendo del sistema...\nHasta pronto.");
                        input.close();
                        break;
                    default:
                        break;
                }
            }*/
	    //} while (bandera);
    }
}
