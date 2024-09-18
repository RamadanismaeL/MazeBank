/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class ClientController implements Initializable {

    @SuppressWarnings("exports")
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewsFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case TRANSACTIONS :
                    client_parent.setCenter(Model.getInstance().getViewsFactory().getTransactionsView()); break;
                case ACCOUNTS :
                    client_parent.setCenter(Model.getInstance().getViewsFactory().getAccountsView()); break;
                default :
                    client_parent.setCenter(Model.getInstance().getViewsFactory().getDashboardView()); break;
            }
        });
    }
    
}
