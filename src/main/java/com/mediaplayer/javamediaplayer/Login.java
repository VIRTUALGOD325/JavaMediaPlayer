package com.mediaplayer.javamediaplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void loginButtonClicked(ActionEvent actionEvent) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Here you can implement your login logic.
        // For example, you might check if the username and password are valid.
        // For demonstration purposes, let's just print them.
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // After successful login, you can navigate to another scene or perform other actions.
    }
}
