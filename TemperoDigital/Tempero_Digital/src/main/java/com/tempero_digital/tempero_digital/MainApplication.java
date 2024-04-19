package com.tempero_digital.tempero_digital;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login_page.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Página de Login");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}