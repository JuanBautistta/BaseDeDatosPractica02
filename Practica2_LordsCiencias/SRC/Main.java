package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    
    public static void main(String[] args) {
        boolean bandera;
	    int opcion = 0;
	    Scanner input = new Scanner(System.in);
	    ArrayList<Categoria> operadores = new ArrayList<>();
        operadores.add(new Categoria("canica", "son grandes", 100));
        operadores.add(new Categoria("canica2", "son grandes2", 100));
        operadores.add(new Categoria("canica3", "son grandes3", 100));
        OperarArchivos archivo = new OperarArchivos("categoria.csv");
	    do {
            bandera = true;
            System.out.println("Ingresa la opción deseada\n" + "1-Agregar Operador\n" + "2-Ver Operadores\n"
            + "3-Editar Operador\n" + "4-Borrar Operador\n" + "5-Salir\n");
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
            }
	    } while (bandera);
    }

}
