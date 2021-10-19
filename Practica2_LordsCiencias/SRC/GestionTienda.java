package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GestionTienda{

  String archClientes = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Clientes.csv";
  String archProveedores = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Proveedores.csv";
  String archProductos = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Productos.csv";
  String archCategorias = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Categorias.csv";
  ArrayList<Cliente> listaClientes = new ArrayList<>();
  ArrayList<Provedor> listaProveedores = new ArrayList<>();
  ArrayList<Producto> listaProductos = new ArrayList<>();
  ArrayList<Categoria> listaCategorias = new ArrayList<>();

  /**
    * Método que inicia la gestión de la tienda virtual.
    */
  public void gestionarTienda() throws FileNotFoundException, IOException, Exception{
    boolean bandera = true;
	  Scanner input = new Scanner(System.in);
    LecturaYEscritura lectura = new LecturaYEscritura();

    listaClientes = listarClientes(lectura.leeArchivo1(archClientes));
    listaProveedores = listarProveedores(lectura.leeArchivo1(archProveedores));
    listaProductos = listarProductos(lectura.leeArchivo1(archProductos));
    listaCategorias = listarCategorias(lectura.leeArchivo1(archCategorias));
    //for (int i = 0; i < listaClientes.size(); i++) System.out.println(listaClientes.get(i));
    //Los println's
    for (int i = 0; i < listaClientes.size(); i++) System.out.println(listaClientes.get(i).toString());
    for (int i = 0; i < listaProveedores.size(); i++) System.out.println(listaProveedores.get(i).toString());
    for (int i = 0; i < listaProductos.size(); i++) System.out.println(listaProductos.get(i).toString());
    for (int i = 0; i < listaCategorias.size(); i++) System.out.println(listaCategorias.get(i).toString());
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
    ConsultaProducto consulta = new ConsultaProducto();
    Producto producto = consulta.get();
    switch (eleccion){
      case 1:
        this.listaProductos.add(producto);
        System.out.println("Producto agregado");
        for (Producto p : this.listaProductos) {
          System.out.println(p.toString());
        }
        break;
      case 2:
        int i = this.listaProductos.indexOf(producto);
        if (i > 0) {
          System.out.println("Producto:");
          System.out.println(this.listaProductos.get(i).toString());
        } else {
          System.out.println("No se encontró el producto");
        }
        break;
      case 3:
        int j = this.listaProductos.indexOf(producto);
        if (j > 0) {
          this.listaProductos.set(j, producto);
          System.out.println("Producto actualizado");
        } else {
          System.out.println("No se encontró el producto");
        }
        break;
      case 4:
        System.out.println("Producto Eliminado");
        this.listaProductos.remove(producto);
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
    ConsultaProveedor consulta = new ConsultaProveedor();
    Provedor p = consulta.get();
    switch (eleccion) {
      case 1:
        this.listaProveedores.add(p);
        System.out.println("Proveedor agregado");
        break;
      case 2:
        int index = this.listaProveedores.indexOf(p);
        if (index > 0) {
          System.out.println(this.listaProveedores.get(index).toString());
        } else {
          System.out.println("El proveedor no está registrado");
        }
        break;
      case 3:
        int j = this.listaProveedores.indexOf(p);
        if (j > 0) {
          this.listaProveedores.set(j, p);
          System.out.println("Datos del proveedor actualizados");
        } else {
          System.out.println("No se encontró al proveedor");
        }
        break;
      case 4:
        this.listaProveedores.remove(p);
        System.out.println("Proveedor Eliminado");
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


  /**
  * Método que genera una lista de clientes
  * @param datos Lista Lista con los datos, a partir de ellos se generan los clientes
  * @return Regresa una lista con clientes
  */
  private ArrayList<Cliente> listarClientes(ArrayList<String> datos){
    ArrayList<Cliente> clientes = new ArrayList<>();
    for (int i = 0; i < datos.size(); i++){
      String[] parts = datos.get(i).split(",");
      Nombre nombre = new Nombre(parts[0], parts[1], parts[2]);
      String nacimiento = parts[3];
      String genero = parts[4];
      String curp = parts[5];
      Direccion direc = new Direccion(Integer.parseInt(parts[6]), parts[7], parts[8], parts[9], Integer.parseInt(parts[10]));
      String correo = parts[11];
      String pass = parts[12];
      String pago = parts[13];
      int puntos = Integer.parseInt(parts[14]);
      Cliente cliente = new Cliente(nombre, nacimiento, genero, curp, direc, correo, pass, pago, puntos);
      clientes.add(cliente);
    }
    return clientes;
  }


  /**
  * Método que genera una lista de proveedores
  * @param datos Lista con los datos, a partir de ellos se generan los proveedores
  * @return Regresa una lista con los proveedores
  */
  private ArrayList<Provedor> listarProveedores(ArrayList<String> datos){
    ArrayList<Provedor> proveedores = new ArrayList<>();
    for (int i = 0; i < datos.size(); i++){
      String[] parts = datos.get(i).split(",");
      String nombre = parts[0];
      String RFC = parts[1];
      Direccion direc = new Direccion(Integer.parseInt(parts[2]), parts[3], parts[4], parts[5], Integer.parseInt(parts[6]));
      String[] numeros = parts[7].split("#");
      Telefono[] telefonos = new Telefono[numeros.length];
      for(int j = 0; j < numeros.length; j++){
        Telefono tel = new Telefono(Integer.parseInt(numeros[j]));
        telefonos[j] = tel;
      }
      Provedor proveedor = new Provedor(nombre, RFC, direc, telefonos);
      proveedores.add(proveedor);
    }
    return proveedores;
  }


  /**
  * Método que genera una lista de productos
  * @param datos Lista con los datos, a partir de ellos se generan los productos
  * @return Regresa una lista con los productos
  */
  private ArrayList<Producto> listarProductos(ArrayList<String> datos){
    ArrayList<Producto> productos = new ArrayList<>();
    for (int i = 0; i < datos.size(); i++){
      String[] parts = datos.get(i).split(",");
      String nombre = parts[0];
      float precio = Float.valueOf(parts[1]);
      int stock = Integer.parseInt(parts[2]);
      String descripcion = parts[3];
      String imagen = parts[4];
      float descuento = Float.valueOf(parts[5]);

      Producto producto = new Producto(nombre, precio, stock, descripcion, imagen, descuento);
      productos.add(producto);
    }
    return productos;
  }


  /**
  * Método que genera una lista de categorías
  * @param datos Lista con los datos, a partir de ellos se generan las categorias
  * @return Regresa una lista con las categorías
  */
  private ArrayList<Categoria> listarCategorias(ArrayList<String> datos){
    ArrayList<Categoria> categorias = new ArrayList<>();
    for (int i = 0; i < datos.size(); i++){
      String[] parts = datos.get(i).split(",");
      String nombre = parts[0];
      String descripcion = parts[1];
      int stock = Integer.parseInt(parts[2]);

      Categoria categoria = new Categoria(nombre, descripcion, stock);
      categorias.add(categoria);
    }
    return categorias;
  }
}
