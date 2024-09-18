package com.jmc.mazebank.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccountsController implements Initializable {
    @SuppressWarnings("exports")
    public Label ch_acc_num;
    @SuppressWarnings("exports")
    public Label transaction_limit;
    @SuppressWarnings("exports")
    public Label ch_acc_date;
    @SuppressWarnings("exports")
    public Label ch_acc_bal;
    @SuppressWarnings("exports")
    public Label sv_acc_num;
    @SuppressWarnings("exports")
    public Label withdrawal_limit;
    @SuppressWarnings("exports")
    public Label sv_acc_date;
    @SuppressWarnings("exports")
    public Label sv_acc_bal;
    @SuppressWarnings("exports")
    public TextField amount_to_sv;
    @SuppressWarnings("exports")
    public Button trans_to_sv_btn;
    @SuppressWarnings("exports")
    public TextField amount_to_ch;
    @SuppressWarnings("exports")
    public Button trans_to_ch_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
    
}
