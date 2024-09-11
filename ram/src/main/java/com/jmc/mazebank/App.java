/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) {        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/jmc/mazebank/Fxml/Login.fxml"));
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
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}