package com.EC2026.SGDU.administración.gestionUsuarios.controller;

import com.EC2026.SGDU.core.util.NavigationUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {

    @FXML
    private Button btnForgetPass;

    @FXML
    private Button btnLogin;

    @FXML
    private ComboBox<String> comboUser;

    @FXML
    private Button iconEye;

    @FXML
    private Label iconUser;

    @FXML
    private Label iconUserName;

    @FXML
    private PasswordField txtPassField;

    @FXML
    private TextField txtPassVisible;

    @FXML
    private TextField txtUsername;

    private final String [] perfiles = {"ADMINISTRADOR", "VENTAS", "DEPORTIVO"};

    @FXML
    void login(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ingreso éxitoso");
        alert.setHeaderText("Bienvenido al sistema");
        alert.setContentText("Se ha autenticado correctamente");
        alert.showAndWait();

        Parent root = FXMLLoader.load(getClass().getResource("/administracion/fxml/mainMenu.fxml"));
        NavigationUtil.changeScene(event,root);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        txtPassField.textProperty().bindBidirectional(txtPassVisible.textProperty());
        txtPassVisible.setVisible(false);
        txtPassVisible.setManaged(false);

        FontIcon icon = new FontIcon("fa-get-pocket");
        FontIcon icon2 = new FontIcon("fa-id-card");
        FontIcon icon3 = new FontIcon("fa-eye");
        FontIcon icon4 = new FontIcon("fa-eye-slash");

        icon.getStyleClass().add("iconoUserPr");
        icon2.getStyleClass().add("usernameIcon");
        icon3.getStyleClass().add("eyeIcon");
        icon4.getStyleClass().add("eyeIconClosed");


        iconUser.setGraphic(icon);
        iconUserName.setGraphic(icon2);
        iconEye.setGraphic(icon3);
        iconUser.setText(null);
        iconUserName.setText(null);
        comboUser.getItems().addAll(perfiles);



    }

    @FXML
    void seePass(ActionEvent event) {
        FontIcon icon = null;
        if (txtPassField.isVisible()) {
            txtPassField.setVisible(false);
            txtPassField.setManaged(false);
            txtPassVisible.setVisible(true);
            txtPassVisible.setManaged(true);
            icon = new FontIcon("fa-eye-slash");
            icon.getStyleClass().add("eyeIconClosed");

        } else {
            txtPassField.setVisible(true);
            txtPassField.setManaged(true);
            txtPassVisible.setVisible(false);
            txtPassVisible.setManaged(false);
            icon = new FontIcon("fa-eye");
            icon.getStyleClass().add("eyeIcon");

        }

        iconEye.setGraphic(icon);

    }

    @FXML
    void changeToBlack(MouseEvent event) {
        FontIcon icon = (FontIcon) iconEye.getGraphic();

        icon.getStyleClass().remove("eyeBlue");
        icon.getStyleClass().add("eyeBlack");
    }

    @FXML
    void changeToBlue(MouseEvent event) {
        FontIcon icon = (FontIcon) iconEye.getGraphic();

        icon.getStyleClass().remove("eyeBlack");
        icon.getStyleClass().add("eyeBlue");

    }
}
