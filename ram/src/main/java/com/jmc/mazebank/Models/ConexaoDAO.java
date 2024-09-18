package com.jmc.mazebank.Models;

import java.sql.*;

public class ConexaoDAO {
    private Connection conexao;
    private final String url = "jdbc:sqlite:mazebank.db";

    public ConexaoDAO() {
        try {
            this.conexao = DriverManager.getConnection(url);
            System.out.println("Conectado!");
        }  catch(SQLException erro) {
            System.out.println(erro.getMessage());
        }
    }

    // CLIENT
    @SuppressWarnings("exports")
    public ResultSet getClientData(String pAddress, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conexao.createStatement();
            resultSet = statement.executeQuery("select * from Clients where PayeeAdress='"+pAddress+"' and Password='"+password+"';");
        } catch(SQLException err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
        return resultSet;
    }
}
