package com.java.methods;

import com.java.classes.Coche;
import java.util.Scanner;
import java.util.ArrayList;
public class Metodos {
    private static Scanner sc=new Scanner(System.in);
    private static Coche c;
    private static ArrayList coches = new ArrayList<>();
    public static int MostrarMenu(){
        System.out.println("**************************");
        System.out.println("*  Seleccione opcion     *");
        System.out.println("*   1. Añadir coche      *");
        System.out.println("*   2. Mostrar coches    *");
        System.out.println("*   3. Mostrar un coche  *");
        System.out.println("*   4. Salir             *");
        System.out.println("**************************");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }
    public static void AñadirCoche(){
        System.out.println("Seleccione marca");
        String marca=sc.nextLine();
        System.out.println("Seleccione numero de puertas");
        int puerta= Integer.parseInt(sc.nextLine());
        c=new Coche(marca,puerta);
        coches.add(c);
    }
    public static void ListarCoches(){
        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }
    }
    public static void MostrarCoche(){
        System.out.println("¿De qué marca es el coche que quieres ver?");
        String marca = sc.nextLine();

        for (int i = 0; i < coches.size(); i++) {
            c= (Coche) coches.get(i);
            c.getMarca();
            if(c.getMarca().equals(marca)){
                System.out.println(c.toString());
            }
        }
    }
}
