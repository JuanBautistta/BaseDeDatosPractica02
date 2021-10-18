package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GestionTienda{

  private String archClientes;
  private String archProveedores;
  private String archProductos;
  private String archCategorias;
  private ArrayList<Cliente> listaClientes;
  private ArrayList<Provedor> listaProveedores;
  private ArrayList<Producto> listaProductos;
  private ArrayList<Categoria> listaCategorias;

  /**
  * Constructor de la clase GestionTienda
  */
  public GestionTienda(){
    archClientes = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Clientes.csv";
    archProveedores = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Proveedores.csv";
    archProductos = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Productos.csv";
    archCategorias = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Categorias.csv";
    listaClientes = new ArrayList<>();
    listaProveedores = new ArrayList<>();
    listaProductos = new ArrayList<>();
    listaCategorias = new ArrayList<>();
  }




  /**
    * Método que inicia la gestión de la tienda virtual.
    */
  public void gestionarTienda() throws FileNotFoundException, IOException, Exception{
    boolean bandera = true;
	  Scanner input = new Scanner(System.in);

    /*String archClientes = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Clientes.csv";
    String archProveedores = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Proveedores.csv";
    String archProductos = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Productos.csv";
    String archCategorias = "BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Categorias.csv";
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Provedor> listaProveedores = new ArrayList<>();
    ArrayList<Producto> listaProductos = new ArrayList<>();
<<<<<<< HEAD
    ArrayList<Categoria> listaCategorias = new ArrayList<>();*/
    /*
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Provedor> listaProveedores = new ArrayList<>();
    ArrayList<Producto> listaProductos = new ArrayList<>();
    ArrayList<Categoria> listaCategorias = new ArrayList<>();*/
=======

>>>>>>> 5f39065 (Se crean 4 listas a partir de los archivos csv.)
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
        OperarArchivos escrituraClientes = new OperarArchivos(archClientes);
        OperarArchivos escrituraProveedores = new OperarArchivos(archProveedores);
        OperarArchivos escrituraProductos = new OperarArchivos(archProductos);
        OperarArchivos escrituraCategorias = new OperarArchivos(archCategorias);
        escrituraClientes.escribeOpeador(listaClientes);
        escrituraProveedores.escribeOpeador(listaProveedores);
        escrituraProductos.escribeOpeador(listaProductos);
        escrituraCategorias.escribeOpeador(listaCategorias);
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

  private Categoria agregaCategoria(){
    try {
      Scanner categoria = new Scanner(System.in);
      String nombre;
      String descripcion;
      int numeroDeProductos;
      System.out.println("Dame un nombre para la categoria");
      nombre = categoria.nextLine();
      System.out.println("Dame una descripcion sobre dicha categoria");
      descripcion = categoria.nextLine();
      System.out.println("Dame el numero de productos de esa categoria");
      numeroDeProductos = categoria.nextInt();
      if (numeroDeProductos < 0) error();
      return new Categoria(nombre, descripcion, numeroDeProductos);
    } catch (Exception e) {
      error();
    }
    return null;
  }

  /**
  * Método que llama a la función de Categoría que eligió el usuario
  * @param eleccion Entero que es la operación que se quiere realizar
  */
  private void gestionarCategorias(int eleccion){
    switch (eleccion){
      case 1:
        listaCategorias.add(agregaCategoria());
        break;
      case 2:
        for (Categoria categoria : listaCategorias) {
          System.out.println(categoria.toString());
        }
        break;
      case 3:
        Categoria categoria = agregaCategoria();
        Scanner scn = new Scanner(System.in);
        int indice = listaCategorias.indexOf(categoria);
        if (indice != -1) {
          System.out.println("indica que atributo deceas modificar:");
          System.out.println("Nombre - 1");
          System.out.println("descripcion - 2");
          System.out.println("Numero de productos - 3");
          int elec = scn.nextInt();
          if(elec<1 || elec >3) error();
          System.out.println("Dame el nuevo valor");
          scn.next();
          String nuevoValor = scn.nextLine();
          switch (elec) {
            case 1:
              listaCategorias.get(indice).setNombre(nuevoValor);  
              break;
            case 2:
              listaCategorias.get(indice).setDescripcion(nuevoValor);
              break;
            case 3:
              listaCategorias.get(indice).setNumeroDeProductos(Integer.parseInt(nuevoValor));
              break;
          }
        }
        break;
      case 4:
        Categoria categoria2 = agregaCategoria();
        int indice2 = listaCategorias.indexOf(categoria2);
        if(indice2 != -1){
          listaCategorias.remove(indice2);
        }else{
          System.out.println("EL elemento no existe");
        }
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
        agregaCliente();
        for (int i = 0; i < listaClientes.size(); i++) System.out.println(listaClientes.get(i).toString());

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
  * Método que agrega un cliente a la listaClientes
  * @param input Objeto de la clase Scanner para solicitar datos del nuevo cliente
  */
  private void agregaCliente(){
    System.out.println("\n=============== Agregar Cliente ===============");
    Scanner input = new Scanner(System.in);
    System.out.print("Nombre: ");
    String nom = input.nextLine();
    System.out.print("Apellido paterno: ");
    String apellidoP = input.nextLine();
    System.out.print("Apellido materno: ");
    String apellidoM = input.nextLine();
    System.out.print("Fecha de nacimiento: ");
    String nacimiento = input.nextLine();
    System.out.print("Genero: ");
    String genero = input.nextLine();
    System.out.print("CURP: ");
    String curp = input.nextLine();
    System.out.print("Calle: ");
    String calle = input.nextLine();
    System.out.print("Número: ");
    int numero = input.nextInt();
    System.out.print("Estado: ");
    String estado = input.nextLine();
    System.out.print("Municipio: ");
    String municipio = input.nextLine();
    System.out.print("Código postal: ");
    int cp = input.nextInt();
    System.out.print("Correo electrónico: ");
    String correo = input.nextLine();
    System.out.print("Password: ");
    String pass = input.nextLine();
    System.out.print("Forma de pago: ");
    String pago = input.nextLine();
    System.out.print("Puntos: ");
    int puntos = input.nextInt();
    Nombre nombre = new Nombre(nom, apellidoP, apellidoM);
    Direccion direccion = new Direccion(cp, municipio, estado, calle, numero);
    Cliente nuevo = new Cliente(nombre, nacimiento, genero, curp, direccion, correo, pass, pago, puntos);
    listaClientes.add(nuevo);
    System.out.print("Se agregó el nuevo cliente.");
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
