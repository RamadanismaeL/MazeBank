/**
 * @author Ramadan ismaeL
 */

 package com.jmc.mazebank.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;
import com.jmc.mazebank.Views.AccountType;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
 public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_selector;
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
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
        acc_selector.setValue(Model.getInstance().getViewsFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> Model.getInstance().getViewsFactory().setLoginAccountType(acc_selector.getValue()));
        close_btn.setOnAction(event -> close());
        login_btn.setOnAction(event -> onLogin());
    }

    private void close() {
        System.exit(0);
    }

    private void onLogin() {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewsFactory().closeStage(stage);
        if(Model.getInstance().getViewsFactory().getLoginAccountType() == AccountType.CLIENT) {
            Model.getInstance().getViewsFactory().showClientWindow();

            /*Model.getInstance().evalueteClientCred(payee_address_fld.getText(), password_fld.getText());
            if(Model.getInstance().getClienLoginSuccessFlag()) {
                Model.getInstance().getViewsFactory().showClientWindow();
                Model.getInstance().getViewsFactory().closeStage(stage);
            } else {
                payee_address_fld.setText("");
                password_fld.setText("");
                error_lbl.setText("No Such Login Credentials!");
            }*/
            
        } else {
            Model.getInstance().getViewsFactory().showAdminWindow();
        }
    }
 }
 