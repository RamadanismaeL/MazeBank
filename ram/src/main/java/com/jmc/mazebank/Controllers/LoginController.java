/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private ChoiceBox<?> acc_selector;

    @FXML
    private Button close_btn;

    @FXML
    private Label error_lbl;

    @FXML
    private Button login_btn;

    @FXML
    private TextField password_fld;

    @FXML
    private TextField payee_address_fld;

    @FXML
    private Label payee_address_lbl;

    @FXML
    private void close() {
        System.exit(0);
    }
}
