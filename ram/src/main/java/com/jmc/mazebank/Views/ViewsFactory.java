/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Admin.AdminController;
import com.jmc.mazebank.Controllers.Client.ClientController;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewsFactory {
    private AccountType loginAccountType;
    // Client Views
    //private final StringProperty clientSelectedMenuItem;
    private final ObjectProperty<ClientMenuOptions> clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

    // Admin Views
    private final ObjectProperty<AdminMenuOptions> adminSelectedMenuItem;
    private AnchorPane createClientView;
    private AnchorPane clientsView;
    private AnchorPane depositView;

    public ViewsFactory(){
        this.loginAccountType = AccountType.CLIENT;
        this.clientSelectedMenuItem = new SimpleObjectProperty<>();
        this.adminSelectedMenuItem = new SimpleObjectProperty<>();
    }

    
    public AccountType getLoginAccountType() {
        return this.loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }



    public ObjectProperty<ClientMenuOptions> getClientSelectedMenuItem() {
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

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Client/Client.fxml"));
        ClientController clientController = new ClientController();

        loader.setController(clientController);
        createStage(loader);
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


    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch(Exception erro) {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
        Stage stage = new Stage();
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        Image iconBank = new Image(String.valueOf(getClass().getResource("/com/jmc/mazebank/Images/lnx.jpg")));
        stage.getIcons().add(iconBank);
        stage.setResizable(false);        
        stage.setTitle("Maze Bank");
        stage.show();
    }

    @SuppressWarnings("exports")
    public void closeStage(Stage stage) {
        stage.close();
    }

    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItem() {
        return this.adminSelectedMenuItem;
    }

    public void showAdminWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Admin/Admin.fxml"));
        AdminController controller = new AdminController();
        loader.setController(controller);
        createStage(loader);
    }

    @SuppressWarnings("exports")
    public AnchorPane getCreateClientView() {
        if(createClientView == null) {
            try {
                createClientView = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Admin/CreateClient.fxml")).load();
            } catch(Exception error) {
                System.out.println(error.getMessage());
                error.printStackTrace();
            }
        }
        return createClientView;
    }

    @SuppressWarnings("exports")
    public AnchorPane getClientsView() {
        if(clientsView == null) {
            try {
            clientsView = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Admin/Clients.fxml")).load();
            } catch(Exception erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
        return clientsView;
    }

    @SuppressWarnings("exports")
    public AnchorPane getDepositView() {
        if(depositView == null) {
            try {
                depositView = new FXMLLoader(getClass().getResource("/com/jmc/mazebank/Controllers/Admin/Deposit.fxml")).load();
            } catch(Exception erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
        return depositView;
    }
}
