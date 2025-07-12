package org.acceso;
import java.sql.*;
import java.util.Scanner;

public class Operaciones {
    public static void insertarValores(String tabla) {
        try (Connection conexion = ConexionDB.conectar()) {
            if (conexion == null) {
                System.out.println("No se pudo establecer la conexión.");
                return;
            }
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void registrarPrestamo() {
        try (Connection conexion = ConexionDB.conectar()) {
            if (conexion == null) {
                System.out.println("No se pudo establecer la conexión.");
                return;
            }
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void Actualizar(String tabla) {
        try (Connection conexion = ConexionDB.conectar()) {
            if (conexion == null) {
                System.out.println("No se pudo establecer la conexión.");
                return;
            }
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void consultarValores (String tabla) {
        try (Connection conexion = ConexionDB.conectar()) {
            if (conexion == null) {
                System.out.println("No se pudo establecer la conexión.");
                return;
            }
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void eliminarValores(String tabla) {
        try (Connection conexion = ConexionDB.conectar()) {
            if (conexion == null) {
                System.out.println("No se pudo establecer la conexión.");
                return;
            }
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
