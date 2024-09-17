/**
 * @author Ramadan ismaeL
 */

 package com.jmc.mazebank.Controllers;

 import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
 
 public class LoginController implements Initializable {
    @SuppressWarnings({ "exports", "rawtypes" })
    public ChoiceBox acc_selector;
    @SuppressWarnings("exports")
    public Label payee_address_lbl;
    @SuppressWarnings("exports")
    public TextField payee_address_fld;
    @SuppressWarnings("exports")
    public TextField password_fld;
    @SuppressWarnings("exports")
    public Button login_btn;
    @SuppressWarnings("exports")
    public Label error_lbl;
    
    @FXML
    public void close() throws IOException {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> Model.getInstance().getViewsFactory().showClientWindow());
    }
 }
 