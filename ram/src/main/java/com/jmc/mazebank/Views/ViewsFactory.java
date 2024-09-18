/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Client.ClientController;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewsFactory {
    // Client Views
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

    public ViewsFactory(){
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    @SuppressWarnings("exports")
    public StringProperty getClientSelectedMenuItem() {
        return this.clientSelectedMenuItem;
    }

    @SuppressWarnings("exports")
    public AnchorPane getDashboardView() {
        if(dashboardView == null) {
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Client/Dashboard.fxml")).load();
            } catch(Exception erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
        return dashboardView;
    }

    @SuppressWarnings("exports")
    public AnchorPane getTransactionsView() {
        if(transactionsView == null) {
            try {
                transactionsView = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Client/Transaction.fxml")).load();
            } catch(Exception erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
        return transactionsView;
    }

    @SuppressWarnings("exports")
    public AnchorPane getAccountsView() {
        if(accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Client/Accounts.fxml")).load();
            } catch(Exception erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
        return accountsView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Login.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch(Exception erro) {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.setTitle("Maze Bank");
        stage.show();
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Client/Client.fxml"));
        ClientController clientController = new ClientController();

        loader.setController(clientController);
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch(Exception erro) {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Maze Bank");
        stage.show();
    }

    @SuppressWarnings("exports")
    public void closeStage(Stage stage) {
        stage.close();
    }
}
