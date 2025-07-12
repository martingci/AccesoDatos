package org.acceso;
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

    public static int leerOpcionMenu(int minValor, int maxValor){
        int opcion;
        while(true){
            try{
                System.out.print("Seleccione una opción: ");
                opcion = scanner().nextInt();
                if(opcion >= minValor && opcion <= maxValor){
                    break;
                } else {
                    System.out.println("Ingrese un número valido.");
                }
            } catch (InputMismatchException e ){
                System.out.println("Ingrese una entrada valida. Intente de nuevo.");
            }
        }
        return opcion;
    }

    public static String pedirString(String mensaje) {
        System.out.print(mensaje);
        String string;
        while (true){
            string = scanner().nextLine();
            if (string.isEmpty()){
                System.out.print("Por favor ingrese una entrada no vacía: ");
            }else{break;}
        }
        return string;
    }

    public static int pedirInt(String mensaje) {
        int value;
        while (true) {
            try {
                System.out.print(mensaje);
                value = scanner().nextInt();
                break;
            } catch(Exception InputMismatchException){
                System.out.print("Entrada no válida. Ingrese un número. "); // excepcion en caso de no ser numero
            }
        }
        return value;
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
