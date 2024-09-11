/**
 * @author Ramadan ismaeL
 */

package com.jmc.mazebank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) throws Exception {
        /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());*/

        Parent root = FXMLLoader.load(getClass().getResource("/com/jmc/mazebank/Fxml/Login.fxml"));
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}