package BaseDeDatosPractica02.Practica2_LordsCiencias.SRC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
    GestionTienda gestor = new GestionTienda();
    gestor.gestionarTienda();
  }
}
