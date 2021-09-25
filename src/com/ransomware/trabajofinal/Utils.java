package com.ransomware.trabajofinal;

import java.util.Scanner;

public class Utils {

  static int showMenu(String titulo, String[] opciones, String ultimaOpcion) {
    System.out.println("\n" + titulo.toUpperCase());
    String alternativas = "0";

    for (int i = 0; i < opciones.length; i++) {
      System.out.println((i + 1) + ") " + opciones[i]);
      alternativas += "," + (i + 1);
    }

    System.out.println("0) " + ultimaOpcion);

    final int OPTION_NOSELECTION = -1;
    int opcion = OPTION_NOSELECTION;
    Scanner sc;

    while (opcion == OPTION_NOSELECTION) {
      System.out.print("\nIngrese una opción del menú [" + alternativas + "]: ");

      sc = new Scanner(System.in);

      try {
        opcion = sc.nextInt();
      } catch (Exception error) {
        opcion = OPTION_NOSELECTION;
      }

      if (opcion <= OPTION_NOSELECTION || opcion > opciones.length) {
        System.out.println("> Opción no válida, vuelva a intentarlo.");
        opcion = OPTION_NOSELECTION;
      }
    }

    return opcion;
  }

  static int buscarOpcion(String[] opciones, String opcion) {
    int posicion = -1;

    for (int i = 0; i < opciones.length; i++) {
      if (opcion.equalsIgnoreCase(opciones[i])) {
        posicion = i;
        break;
      }
    }

    return posicion;
  }

}
