package com.jmc.mazebank.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;
import com.jmc.mazebank.Views.AdminMenuOptions;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class AdminMenuController implements Initializable {
    @SuppressWarnings("exports")
    public Button create_client_btn;
    @SuppressWarnings("exports")
    public Button clients_btn;
    @SuppressWarnings("exports")
    public Button deposit_btn;
    @SuppressWarnings("exports")
    public Button logout_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addListeners();
    }

    private void addListeners(){
        create_client_btn.setOnAction(event -> onCreateClient());
        clients_btn.setOnAction(event -> onClients());
        deposit_btn.setOnAction(event -> onDeposit());
    }

    private void onCreateClient() {        
        Model.getInstance().getViewsFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CREATE_CLIENT);
    }

    private void onClients() {
        Model.getInstance().getViewsFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CLIENTS);
    }

    private void onDeposit() {
        Model.getInstance().getViewsFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.DEPOSIT);
    }    
}
