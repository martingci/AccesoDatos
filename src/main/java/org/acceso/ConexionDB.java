package org.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class ConexionDB {
    // parámetros para conexión a la base de datos
    private static final String URL = "jdbc:postgresql://localhost:5432/biblioteca";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ICC505";

    // Conecta con la base de datos.

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver"); // Cargar el driver de PostgreSQL
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
