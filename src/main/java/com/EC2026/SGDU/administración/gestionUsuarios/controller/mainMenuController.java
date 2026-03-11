package com.EC2026.SGDU.administración.gestionUsuarios.controller;

import com.EC2026.SGDU.core.util.NavigationUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class mainMenuController {

    @FXML
    private Button btnLogOut;

    @FXML
    void LogOut(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/administracion/fxml/login.fxml"));
        NavigationUtil.changeScene(event,root);

    }

}
