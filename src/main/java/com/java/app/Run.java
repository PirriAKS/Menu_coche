package com.java.app;
import static com.java.methods.Metodos.*;

public class Run {
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = MostrarMenu();
            switch (opcion) {
                case 1:
                    AñadirCoche();
                    break;
                case 2:
                    ListarCoches();
                    break;
                case 3:
                    MostrarCoche();
                    break;
                case 4:
                    System.out.println("Hasta otra");
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }
        } while (opcion != 4);
    }
}
