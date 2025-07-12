package org.acceso;
import java.sql.*;
import java.util.Scanner;

public class Operaciones {
    public static void insertarValores(String tabla){
        Connection conexion = ConexionDB.conectar();
        if (conexion == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        conexion.setAutoCommit(false);
    }

    public static void registrarPrestamo(){
        Connection conexion = ConexionDB.conectar();
        if (conexion == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        conexion.setAutoCommit(false);
    }

    public static void Actualizar(String tabla){
        Connection conexion = ConexionDB.conectar();
        if (conexion == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        conexion.setAutoCommit(false);
    }

    public static void consultarValores(String tabla){
        Connection conexion = ConexionDB.conectar();
        if (conexion == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        conexion.setAutoCommit(false);
    }

    public static void eliminarValores(String tabla){
        Connection conexion = ConexionDB.conectar();
        if (conexion == null) {
            System.out.println("No se pudo establecer la conexión.");
            return;
        }
        conexion.setAutoCommit(false);
    }
}
