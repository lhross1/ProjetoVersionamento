/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemplo1jdbc;

/**
 *
 * @author Aluno
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exemplo1JDBC {

    public static void main(String[] args) {
        try {
            Statement s;
            String usuario = "postgres";
            String senha = "postgres";
            String url = "jdbc:postgresql://localhost:5432/postgres";

            Connection c = DriverManager.getConnection(url, usuario, senha);
            s = c.createStatement();
           // s.executeQuery("UPDATE CONTATO SET NOME = 'LUL3' WHERE ID = 3");
            s.executeQuery("INSERT INTO CONTATO VALUES('3', 'Lul', 'lul@gmail.com')");
        c.close();
    }
    catch (Exception E  
        ) {
System.out.println("\n" + E);
    }
}
}