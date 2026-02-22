package org.example;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Download JDBC driver from mvn

        //Connecting java and Database

        /*
        * Import Package
        * Load and register
        * Create connections
        * execute statement
        * process results
        * close
        * */
    Class.forName("org.postgresql.Driver");

    String url="jdbc:postgresql://localhost:5432/Root";
    String user="postgres";
    String passwod="0000";

    Connection connection = DriverManager.getConnection(url,user,passwod);
        System.out.printf("Connection establish");




    }
}
