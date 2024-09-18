package com.jmc.mazebank.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClientCellController implements Initializable {
    @SuppressWarnings("exports")
    public Label fName_lbl;
    @SuppressWarnings("exports")
    public Label lName_lbl;
    @SuppressWarnings("exports")
    public Label pAddress_lbl;
    @SuppressWarnings("exports")
    public Label ch_acc_lbl;
    @SuppressWarnings("exports")
    public Label sv_acc_lbl;
    @SuppressWarnings("exports")
    public Label date_lbl;
    @SuppressWarnings("exports")
    public Button delete_btn;

    @SuppressWarnings("unused")
    private final Client client;

    public ClientCellController(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
    
}
