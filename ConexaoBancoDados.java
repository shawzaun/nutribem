/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carla
 */
public class ConexaoBancoDados {

    Connection conBanco;

    public boolean abrirConexao() {
        String url = "jdbc:mysql://localhost/nutribem?user=root&password=root";
        System.out.println("Conectando ao banco...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conBanco = (Connection) DriverManager.getConnection(url);
            return true;
        } catch (ClassNotFoundException | SQLException erro) {
            return false;
        }
    }

    public boolean fecharConexao() {
        try {
            conBanco.close();
            return true;
        } catch (SQLException erro) {
            return false;
        }
    }

    public Connection obterConexao() {
        return conBanco;
    }
}


