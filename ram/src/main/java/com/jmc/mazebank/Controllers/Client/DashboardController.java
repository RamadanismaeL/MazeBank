package com.jmc.mazebank.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class DashboardController implements Initializable {
    @SuppressWarnings("exports")
    public Text user_name;
    @SuppressWarnings("exports")
    public Label login_date;
    @SuppressWarnings("exports")
    public Label checking_bal;
    @SuppressWarnings("exports")
    public Label checking_acc_num;
    @SuppressWarnings("exports")
    public Label savings_bal;
    @SuppressWarnings("exports")
    public Label savings_acc_num;
    @SuppressWarnings("exports")
    public Label income_lbl;
    @SuppressWarnings("exports")
    public Label expense_lbl;
    @SuppressWarnings({ "exports", "rawtypes" })
    public ListView transaction_listview;
    @SuppressWarnings("exports")
    public TextField payee_fld;
    @SuppressWarnings("exports")
    public TextField amount_fld;
    @SuppressWarnings("exports")
    public TextField message_fld;
    @SuppressWarnings("exports")
    public Button send_money_btn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBoundle) {}
}
