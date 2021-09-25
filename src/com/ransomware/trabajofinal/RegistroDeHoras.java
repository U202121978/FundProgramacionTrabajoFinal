package com.ransomware.trabajofinal;

public class RegistroDeHoras {

  static void menu() {
    final int BUSCAR_TRABAJADOR = 1;
    final int MOSTRAR_TRABAJADORES = 2;

    final String TITULO = "Registro de Horas";
    final String[] OPCIONES = {
      "Buscar trabajador",
      "Mostrar trabajadores"
    };

    int opcionSeleccionada = Utils.showMenu(
      TITULO,
      OPCIONES,
      "Regresar al Menu Principal"
    );

    switch (opcionSeleccionada) {
      case BUSCAR_TRABAJADOR:
        System.out.println("buscar trabajador");
        break;
      case MOSTRAR_TRABAJADORES:
        mostrarTrabajadores();
        break;
      default:
        Principal.menu();
    }
  }

  static void mostrarTrabajadores() {
    String[] trabajadores = new String[BaseDeDatos.trabajadoresTotal];

    for (int i = 0; i < BaseDeDatos.trabajadoresTotal; i++) {
      trabajadores[i] = BaseDeDatos.trabajadoresCodigo[i] +  " - " + BaseDeDatos.trabajdoresNombre[i];
    }

    int opcionSeleccionada = Utils.showMenu(
      "REGISTRO DE HORAS: Seleccione un trabajador",
      trabajadores,
      "Regresar al menu anterior"
    );

    switch(opcionSeleccionada) {
      case 0:
        menu();
        break;
      default:
        registrarHoras(opcionSeleccionada - 1);
    }
  }

  static void registrarHoras(int posicion) {
    System.out.println("REGISTRAR HORAS para " + posicion);
  }
}
