/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements  Initializable{
    @FXML
    private ChoiceBox<?> acc_selector;

    @FXML
    private Label error_lbl;

    @FXML
    private Button login_btn;

    @FXML
    private TextField password_fld;

    @FXML
    private TextField payee_adress_fld;

    @FXML
    private Label payee_adress_lbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
