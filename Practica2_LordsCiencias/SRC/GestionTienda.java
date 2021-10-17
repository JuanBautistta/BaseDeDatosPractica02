package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GestionTienda{

  /**
    * Método que inicia la gestión de la tienda virtual.
    */
  public void gestionarTienda() throws FileNotFoundException, IOException, Exception{
    boolean bandera = true;
	  Scanner input = new Scanner(System.in);
    String archClientes = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Clientes.csv";
    String archProveedores = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Proveedores.csv";
    String archProductos = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Productos.csv";
    String archCategorias = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Categorias.csv";
    ArrayList<String> clientes = new ArrayList<>();
    ArrayList<String> provedores = new ArrayList<>();
    ArrayList<String> productos = new ArrayList<>();
    ArrayList<String> categorias = new ArrayList<>();
    LecturaYEscritura lectura = new LecturaYEscritura();

    clientes = lectura.leeArchivo1(archClientes);
    provedores = lectura.leeArchivo1(archProveedores);
    productos = lectura.leeArchivo1(archProductos);
    categorias = lectura.leeArchivo1(archCategorias);

    //for (int i = 0; i < categorias.size(); i++) System.out.println(clientes.get(i));
    do{
      switch (menuPrincipal(input)){
      case 0:
        bandera = false;
        System.out.println("Saliendo del sistema...\nHasta pronto.");
        break;
      case 1:
        gestionarClientes(menuGestion(input, "Clientes"));
        break;
      case 2:
        gestionarProvedores(menuGestion(input, "Proveedores"));
        break;
      case 3:
        gestionarProductos(menuGestion(input, "Productos"));
        break;
      case 4:
        gestionarCategorias(menuGestion(input, "Categorías"));
        break;
      }
    } while(bandera);
  }


  /**
  * Método que muestra el menú principal y regresa la opción elegida por el usuario
  * @param input Objeto que recibe la entrada del usuario
  * @return Número entero que representa la elección del usuario
  */
  private int menuPrincipal(Scanner input){
    int opcion = 0;
    boolean bandera = true;
    do{
        System.out.println("\n================= Gestión de Tienda Virtual =================");
        System.out.println("- Clientes\t(1)");
        System.out.println("- Proveedores\t(2)");
        System.out.println("- Productos\t(3)");
        System.out.println("- Categorías\t(4)");
        System.out.println("- Salir \t(0)");
        System.out.print("\nSeleccione una opción: ");
        try {
            opcion = input.nextInt();
            if(opcion < 0 || opcion > 4) error();
            else bandera = false;
        } catch (InputMismatchException e) {
          input.next();
          error();
        }
    } while (bandera);
    return opcion;
  }


  /**
  * Método que muestra el menú de acciones que puede realizar para cliente, provedor,
  * producto y categoría
  * @param input Objeto que recibe la entrada del usuario
  * @param eleccion Es cliente o provedor o producto o categoría
  * @return Entero que representa la acción que se quiere realizar
  */
  private int menuGestion(Scanner input, String eleccion){
    int opcion = 0;
    boolean bandera = true;
    do{
        System.out.println("\n================= " + eleccion + " =================");
        System.out.println("- Agregar\t\t(1)");
        System.out.println("- Consultar\t\t(2)");
        System.out.println("- Editar\t\t(3)");
        System.out.println("- Eliminar informacion\t(4)");
        System.out.println("- Menu principal\t(0)");
        System.out.print("\nSeleccione una opción: ");
        try {
            opcion = input.nextInt();
            if(opcion < 0 || opcion > 4) error();
            else bandera = false;
        } catch (InputMismatchException e) {
          input.next();
          error();
        }
    } while (bandera);
    return opcion;
  }


  /**
  * Método que llama a la función de Categoría que eligió el usuario
  * @param eleccion Entero que es la operación que se quiere realizar
  */
  private void gestionarCategorias(int eleccion){
    switch (eleccion){
      case 1:
        System.out.println("Se llama a la fución agregar");
        break;
      case 2:
        System.out.println("Se llama a la función consultar");
        break;
      case 3:
        System.out.println("Se llama a la función editar");
        break;
      case 4:
        System.out.println("Se llama a la función eliminar");
        break;
      default:
        break;
    }
  }


  /**
  * Método que llama a la función de Productos que eligió el usuario
  * @param eleccion Entero que es la operación que se quiere realizar
  */
  private void gestionarProductos(int eleccion){
    switch (eleccion){
      case 1:
        System.out.println("Se llama a la fución agregar");
        break;
      case 2:
        System.out.println("Se llama a la función consultar");
        break;
      case 3:
        System.out.println("Se llama a la función editar");
        break;
      case 4:
        System.out.println("Se llama a la función eliminar");
        break;
      default:
        break;
    }
  }


  /**
  * Método que llama a la función de Provedores que eligió el usuario
  * @param eleccion Entero que es la operación que se quiere realizar
  */
  private void gestionarProvedores(int eleccion){
    switch (eleccion){
      case 1:
        System.out.println("Se llama a la fución agregar");
        break;
      case 2:
        System.out.println("Se llama a la función consultar");
        break;
      case 3:
        System.out.println("Se llama a la función editar");
        break;
      case 4:
        System.out.println("Se llama a la función eliminar");
        break;
      default:
        break;
    }
  }


  /**
  * Método que llama a la función de Clientes que eligió el usuario
  * @param eleccion Entero que es la operación que se quiere realizar
  */
  private void gestionarClientes(int eleccion){
    switch (eleccion){
      case 1:
        System.out.println("Se llama a la fución agregar");
        break;
      case 2:
        System.out.println("Se llama a la función consultar");
        break;
      case 3:
        System.out.println("Se llama a la función editar");
        break;
      case 4:
        System.out.println("Se llama a la función eliminar");
        break;
      default:
        break;
    }
  }


  /**
  * Método que manda un mensaje de error al usuario
  */
  private void error(){
    String negro = "\u001B[0m";
    String rojo = "\u001B[31m";
    System.out.println(rojo + "\nError: " + negro + "Opción inválida." + "\nIntente de nuevo e ingrese una opción válida.");
  }
}
