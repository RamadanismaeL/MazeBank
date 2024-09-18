/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import com.jmc.mazebank.Models.Model;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class AdminController implements Initializable {
    @SuppressWarnings("exports")
    public BorderPane admin_parent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Model.getInstance().getViewsFactory().getAdminSelectedMenuItem().addListener((observableValue, oldValue, newVal) -> {
            switch (newVal) {
                case CLIENTS:
                    admin_parent.setCenter(Model.getInstance().getViewsFactory().getClientsView()); break; 
                case DEPOSIT:
                    admin_parent.setCenter(Model.getInstance().getViewsFactory().getDepositView()); break;            
                default: admin_parent.setCenter(Model.getInstance().getViewsFactory().getCreateClientView()); break;
            }
        });
    }
}
