package com.jmc.mazebank.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateClientController implements Initializable {
    @SuppressWarnings("exports")
    public TextField fName_fld;
    @SuppressWarnings("exports")
    public TextField lName_fld;
    @SuppressWarnings("exports")
    public TextField password_fld;
    @SuppressWarnings("exports")
    public CheckBox pAddress_box;
    @SuppressWarnings("exports")
    public Label pAddress_lbl;
    @SuppressWarnings("exports")
    public CheckBox ch_acc_box;
    @SuppressWarnings("exports")
    public TextField ch_amount_fld;
    @SuppressWarnings("exports")
    public CheckBox sv_acc_box;
    @SuppressWarnings("exports")
    public TextField sv_amount_fld;
    @SuppressWarnings("exports")
    public Button create_client_btn;
    @SuppressWarnings("exports")
    public Label error_lbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
    
}
