package org.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// SAMPLE CODE FOR CONNECTING POSTGRES WITH JAVA.

public class Main {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/database_name";
        String username = "username";
        String password = "password";
        Connection connection = null;

        try {
            // Register the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Connect to the database
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Perform desired database operations
            System.out.println("Successfully connected to the database");

        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection to database failed: " + e.getMessage());
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database connection closed");
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}
