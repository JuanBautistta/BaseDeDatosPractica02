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
  * Método constructor de la clase GestionTienda
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
    * @throws FileNotFoundException Archivo no encontrado
    * @throws IOException Excepción, algo fallo
    * @throws Exception Algo falló
    */
  public void gestionarTienda() throws FileNotFoundException, IOException, Exception{
    boolean bandera = true;
	  Scanner input = new Scanner(System.in);
    LecturaYEscritura lectura = new LecturaYEscritura();
    listaClientes = listarClientes(lectura.leeArchivo1(archClientes));
    listaProveedores = listarProveedores(lectura.leeArchivo1(archProveedores));
    listaProductos = listarProductos(lectura.leeArchivo1(archProductos));
    listaCategorias = listarCategorias(lectura.leeArchivo1(archCategorias));

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
        System.out.println("\n\n============== Gestión de Tienda Virtual =============");
        System.out.println("- Clientes\t\t\t\t\t(1)");
        System.out.println("- Proveedores\t\t\t\t\t(2)");
        System.out.println("- Productos\t\t\t\t\t(3)");
        System.out.println("- Categorías\t\t\t\t\t(4)");
        System.out.println("- Salir \t\t\t\t\t(0)");
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
        System.out.println("\n================= " + eleccion + " ================");
        System.out.println("- Agregar\t\t\t\t(1)");
        System.out.println("- Consultar\t\t\t\t(2)");
        System.out.println("- Editar\t\t\t\t(3)");
        System.out.println("- Eliminar informacion\t\t\t(4)");
        System.out.println("- Menu principal\t\t\t(0)");
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
      numeroDeProductos = dameEntero("Dame el número de productos de esa categoria: ");
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
        System.out.println("\nSe agregó exitosamente.\n");
        break;
      case 2:
        System.out.println("\n\n\nListado de categorías:\n");
        for (Categoria categoria : listaCategorias) {
          System.out.println(categoria.toString());
        }
        break;
      case 3:
        Categoria categoria = agregaCategoria();
        Scanner scn = new Scanner(System.in);
        int indice = listaCategorias.indexOf(categoria);
        if (indice != -1) {
          System.out.println("\nDame la infomación a modificar");
          Categoria nuevo = agregaCategoria();
          listaCategorias.set(indice, nuevo);
          System.out.println("\nModificaciones realizadas");
        }else{
          System.out.println("\nCategoría no encontrada");
        }
        break;
      case 4:
        Categoria categoria2 = agregaCategoria();
        int indice2 = listaCategorias.indexOf(categoria2);
        if(indice2 != -1){
          listaCategorias.remove(indice2);
          System.out.println("\nLa categoría se eliminó exitosamente\n");
        }else{
          System.out.println("El elemento no existe");
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
    ConsultaProducto consulta = new ConsultaProducto();
    switch (eleccion){
      case 1:
        Producto producto = consulta.get();
        this.listaProductos.add(producto);
        System.out.println("Producto agregado");
        break;
      case 2:
        System.out.println("\n\n\nListado de productos:\n");
        for (Producto produc : listaProductos) {
          System.out.println(produc.toString());
        }
        break;
      case 3:
        producto = consulta.get();
        int j = this.listaProductos.indexOf(producto);
        if (j > 0) {
          System.out.println("Modifique los datos");
          Producto nuevo = consulta.get();
          this.listaProductos.set(j, nuevo);
          System.out.println("Producto actualizado");
        } else {
          System.out.println("No se encontró el producto");
        }
        break;
      case 4:
        producto = consulta.get();
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
    switch (eleccion) {
      case 1:
        Provedor p = consulta.get();
        this.listaProveedores.add(p);
        System.out.println("Proveedor agregado");
        break;
      case 2:
        System.out.println("\n\n\nListado de proveedores:\n");
        for (Provedor prov : listaProveedores) {
          System.out.println(prov.toString());
        }
        break;
      case 3:
        p = consulta.get();
        int j = this.listaProveedores.indexOf(p);
        if (j > 0) {
          System.out.println("Modifica datos");
          Provedor nuevo = consulta.get();
          this.listaProveedores.set(j, nuevo);
          System.out.println("Datos del proveedor actualizados");
        } else {
          System.out.println("No se encontró al proveedor");
        }
        break;
      case 4:
        p = consulta.get();
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
        listaClientes.add(generaCliente("Agregar Cliente"));
        System.out.println("\nSe agregó exitosamente.\n");
        break;
      case 2:
        System.out.println("\n\n\nListado de clientes:\n");
        for (Cliente cliente : listaClientes){
          System.out.println(cliente.toString());
        }
        break;
      case 3:
        Cliente cliente = generaCliente("Editar Cliente");
        int indi = listaClientes.indexOf(cliente);
        if(indi == -1){
          System.out.println("Cliente no encontrado");
          break;
        }
        System.out.println("\nModificación de datos:");
        Cliente nuevo = generaCliente("Editar Cliente");
        listaClientes.set(indi, nuevo);
        System.out.println("\nDatos del cliente actualizados\n");
        break;
      case 4:
        System.out.println("Se llama a la función eliminar");
        cliente = generaCliente("Eliminar Cliente");
        int indice = listaClientes.indexOf(cliente);
        if(indice != -1){
          listaClientes.remove(indice);
          System.out.println("\nEl cliente se eliminó exitosamente\n");
        }else{
          System.out.println("\nEl elemento no existe\n");
        }
        break;
      default:
        break;
    }
  }


  /**
  * Método que agrega un cliente a la listaClientes
  */
  private Cliente generaCliente(String operacion){
    System.out.println("\n=============== "+ operacion + " ===============");
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
    int numero = dameEntero("Numero: ");
    System.out.print("Estado: ");
    String estado = input.nextLine();
    System.out.print("Municipio: ");
    String municipio = input.nextLine();
    int cp = dameEntero("Código postal: ");
    System.out.print("Correo electrónico: ");
    String correo = input.nextLine();
    System.out.print("Password: ");
    String pass = input.nextLine();
    System.out.print("Forma de pago: ");
    String pago = input.nextLine();
    int puntos = dameEntero("Puntos: ");
    Nombre nombre = new Nombre(nom, apellidoP, apellidoM);
    Direccion direccion = new Direccion(cp, municipio, estado, calle, numero);
    return new Cliente(nombre, nacimiento, genero, curp, direccion, correo, pass, pago, puntos);
  }

  /**
  * Método que verifica que le pasen un entero mayor o igual a cero
  * @param valorDeseado Cadena que se imprime para solicitar el dato
  * @return Entero mayor o igual a cero
  */
  private int dameEntero(String valorDeseado){
    String negro = "\u001B[0m";
    String rojo = "\u001B[31m";
    Scanner input = new Scanner(System.in);
    int numero = 0;
    boolean bandera = true;
    do{
      System.out.print(valorDeseado);
      try {
          numero = input.nextInt();
          if(numero < 0) System.out.println(rojo + "Error: " + negro + "Entrada inválida.");
          else bandera = false;
      } catch (InputMismatchException e) {
        input.next();
        System.out.println(rojo + "Error: " + negro + "Entrada inválida.");
      }
    } while (bandera);
    return numero;
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
