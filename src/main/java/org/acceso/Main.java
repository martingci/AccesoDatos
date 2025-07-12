package org.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.acceso.Utilidades.leerOpcionMenu;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        menu();
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        while (true){
            mostrarOpcionesMenu();
            int opcion = Utilidades.leerOpcionMenu(1, 6);
            if (opcion == 6){
                break;
            } else {
                ejecutarOpcionMenu(opcion);
            }
        }
        System.out.println("Cerrando programa...");
    }

    public static void ejecutarOpcionMenu(int opcion) throws SQLException, ClassNotFoundException {
        switch (opcion){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    public static void mostrarOpcionesMenu(){
        System.out.println("Tamaño Pizza: ");
        System.out.println("1. Insertar valores (autor, libro, bibliotecario, y lector).");
        System.out.println("2. Registrar préstamo.");
        System.out.println("3. Actualizar valores (autor, libro, bibliotecario, y lector).");
        System.out.println("4. Consultar valores (autor, libro, bibliotecario, lector, y préstamo).");
        System.out.println("5. Eliminar valores (autor, libro, bibliotecario, y lector).");
        System.out.println("6. Salir.");
    }
}