package com.ransomware.trabajofinal;

public class Principal {


  public static void main(String[] args) {
    menu();
  }

  static void menu() {
    final int REGISTRO_DE_HORAS = 1;
    final String TITULO = "Menu Principal";
    final String[] OPCIONES = {
      "Registro de Horas"
    };

    int opcionSeleccionada = Utils.showMenu(
      TITULO,
      OPCIONES,
      "Salir"
    );

    switch (opcionSeleccionada) {
      case REGISTRO_DE_HORAS:
        RegistroDeHoras.menu();
        break;
      default:
        System.out.println("\n¡Hasta luego!");
        break;
    }
  }

  // Utiles



}
