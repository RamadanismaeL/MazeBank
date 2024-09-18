/**
 * @author Ramadan 
 */

package com.jmc.mazebank.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;
import com.jmc.mazebank.Views.ClientMenuOptions;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ClientMenuController implements Initializable {
    @SuppressWarnings("exports")
    public Button dashboard_btn;
    @SuppressWarnings("exports")
    public Button transaction_btn;
    @SuppressWarnings("exports")
    public Button accounts_btn;
    @SuppressWarnings("exports")
    public Button profile_btn;
    @SuppressWarnings("exports")
    public Button logout_btn;
    @SuppressWarnings("exports")
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListener();
    }

    private void addListener() {
        dashboard_btn.setOnAction(event -> onDashboard());
        transaction_btn.setOnAction(event -> onTransaction());
        accounts_btn.setOnAction(event -> onAcconts());
    }

    private void onDashboard() {
        Model.getInstance().getViewsFactory().getClientSelectedMenuItem().set(ClientMenuOptions.DASHBOARD);
    }

    private void onTransaction() {
        Model.getInstance().getViewsFactory().getClientSelectedMenuItem().set(ClientMenuOptions.TRANSACTIONS);
    }

    private void onAcconts() {
        Model.getInstance().getViewsFactory().getClientSelectedMenuItem().set(ClientMenuOptions.ACCOUNTS);
    }
}
