/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Models;

import java.sql.ResultSet;
import java.time.LocalDate;

import com.jmc.mazebank.Views.AccountType;
import com.jmc.mazebank.Views.ViewsFactory;

public class Model {
    private static Model model;
    private final ViewsFactory viewsFactory;
    private final ConexaoDAO conexao;
    private AccountType loginAccountType = AccountType.CLIENT;

    private Client client;
    private boolean clientLoginSuccessFlag;

    private Model() {
        this.viewsFactory = new ViewsFactory();
        this.conexao = new ConexaoDAO();

        this.clientLoginSuccessFlag = false;
        this.client = new Client("", "", "", null, null, null);
    }

    public static synchronized Model getInstance() {
        if(model == null) {
            model = new Model();
        }

        return model;
    }

    public ViewsFactory getViewsFactory() {
        return viewsFactory;
    }

    public ConexaoDAO getConexaoDAO() {return this.conexao;}

    public AccountType getLoginAccountType() {return this.loginAccountType;}
    public void setLoginAccountType(AccountType loginAccountType) {this.loginAccountType = loginAccountType;}

    public boolean getClienLoginSuccessFlag() {return this.clientLoginSuccessFlag;}
    public void setClientLoginSuccessFlag(boolean flag) {this.clientLoginSuccessFlag = flag;}
    public Client getClient() {return this.client;}

    public void evalueteClientCred(String pAddress, String password) {
        CheckingAccount checkingAccount;
        SavingsAccount savingsAccount;
        ResultSet resultSet = conexao.getClientData(pAddress, password);

        try{
            if(resultSet.isBeforeFirst()) {
                while(resultSet.next()) {
                    this.client.firstNameProperty().set(resultSet.getString("FirstName"));
                    this.client.lastNamProperty().set(resultSet.getString("LastName"));
                    this.client.pAddressProperty().set(resultSet.getString("PayeeAddress"));
                    String[] dateParts = resultSet.getString("Date").split("-");
                    LocalDate date = LocalDate.of(Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2]));
                    this.client.dateProperty().set(date);
                    this.clientLoginSuccessFlag = true;
                }
            }
        } catch(Exception err) {
            err.printStackTrace();
        }
    }
}
