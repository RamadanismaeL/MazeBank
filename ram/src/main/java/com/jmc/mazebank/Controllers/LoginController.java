/**
 * @author Ramadan ismaeL
 */

 package com.jmc.mazebank.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
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
    @SuppressWarnings("exports")
    public Button close_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        close_btn.setOnAction(event -> close());
        login_btn.setOnAction(event -> onLogin());
    }

    private void close() {
        System.exit(0);
    }

    private void onLogin() {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewsFactory().closeStage(stage);
        Model.getInstance().getViewsFactory().showClientWindow();
    }
 }
 