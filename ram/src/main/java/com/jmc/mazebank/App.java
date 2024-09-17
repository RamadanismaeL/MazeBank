/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank;

import com.jmc.mazebank.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) { 
        Model.getInstance().getViewsFactory().showLoginWindow();
        
        /*try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/jmc/mazebank/Controllers/Login.fxml"));
            Scene scene = new Scene(root);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println("Erro ao carregar recursos: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}