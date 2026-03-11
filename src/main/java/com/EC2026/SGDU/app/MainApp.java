package com.EC2026.SGDU.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga el FXML desde resources
        Parent root = FXMLLoader.load(getClass().getResource("/administracion/fxml/login.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Sistema de Gestión SGDU");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
