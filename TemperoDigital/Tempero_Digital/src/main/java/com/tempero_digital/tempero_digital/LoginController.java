package com.tempero_digital.tempero_digital;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button Logar;

    @FXML
    private TextField Login;

    @FXML
    private PasswordField Senha;

    @FXML
    private Button fechar;
     @FXML
    private AnchorPane painel_dir;

    @FXML
    private AnchorPane painel_esq;

 public void mudar_de_pag(ActionEvent event) throws IOException {
     Login.getScene().getWindow().hide();
     Parent root = FXMLLoader.load(getClass().getResource("Pag_principal.fxml"));
     Stage stage = new Stage();
     Scene scene = new Scene(root);
     stage.setScene(scene);
     stage.show();

 }
 public void fechar(){
     System.out.println("Fechando");
     System.exit(0);
 }

}
