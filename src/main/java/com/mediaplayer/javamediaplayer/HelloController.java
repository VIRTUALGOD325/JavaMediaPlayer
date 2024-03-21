//package com.mediaplayer.javamediaplayer;
//
//
//
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.input.MouseEvent;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.stage.FileChooser;
//import javafx.stage.Stage;
//
//import java.io.File;
//import java.io.IOException;
//
//public class HelloController {
//
//    @FXML
//    private Button chooseFile;
//    private MediaPlayer mediaPlayer;
//    private Login loginController;
//    private HelloApplication application; // Add this field
//
//    @FXML
//    void chooseFile(MouseEvent event) {
//        FileChooser fc = new FileChooser();
//        fc.setTitle("Select Track");
//        File file = fc.showOpenDialog(null);
//        if(file != null){
//            String selectedFIle = file.toURI().toString();
//            Media media = new Media(selectedFIle);
//            mediaPlayer = new MediaPlayer(media);
//            mediaPlayer.setOnReady(()-> chooseFile.setText(file.getName()));
//        }
//    }
//
//    @FXML
//    void nextTrack(MouseEvent event) {
//        if (mediaPlayer != null) {
//            showAlert("Next Track", "Playing Next Track");
//        } else {
//            showNoFileSelectedAlert();
//        }
//    }
//
//    @FXML
//    void pauseTrack(MouseEvent event) {
//        if (mediaPlayer != null) {
//            mediaPlayer.pause();
//        } else {
//            showNoFileSelectedAlert();
//        }
//    }
//
//    @FXML
//    void playTrack(MouseEvent event) {
//        if (mediaPlayer != null) {
//            mediaPlayer.play();
//        } else {
//            showNoFileSelectedAlert();
//        }
//    }
//
//    @FXML
//    void prevTrack(MouseEvent event) {
//        if (mediaPlayer != null) {
//            showAlert("Previous Track", "Playing Previous Track");
//        } else {
//            showNoFileSelectedAlert();
//        }
//    }
//
//    @FXML
//    void openQueue(MouseEvent event){
//        showAlert("Queue", "Opening Queue");
//    }
//
//    private void showAlert(String title, String message) {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle(title);
//        alert.setHeaderText(null);
//        alert.setContentText(message);
//        alert.showAndWait();
//    }
//
//    private void showNoFileSelectedAlert() {
//        Alert alert = new Alert(Alert.AlertType.WARNING);
//        alert.setTitle("Warning");
//        alert.setHeaderText(null);
//        alert.setContentText("No file selected. Please choose a file.");
//        alert.showAndWait();
//    }
//
//    public void setLoginController(Login loginController) {
//        this.loginController = loginController;
//    }
//
//    @FXML
//    private void loginButtonClicked(ActionEvent event) {
//        // Perform login validation here
//        // Assuming login is successful, close the current window and open the home page
//        closeCurrentWindow(event);
//        openHomePage();
//    }
//
//    private void closeCurrentWindow(ActionEvent event) {
//        // Get the current stage (window)
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        // Close the current stage
//        stage.close();
//    }
//
//    private void openHomePage() {
//        try {
//            // Load the FXML file for the home page
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
//            Parent root = loader.load();
//
//            // Get the controller for the home page
//            HelloController homeController = loader.getController();
//            // Pass any necessary data to the home controller
//
//            // Create a new stage for the home page
//            Stage stage = new Stage();
//            stage.setTitle("Home Page");
//            stage.setScene(new Scene(root));
//            stage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Define the setApplication method
//    public void setApplication(HelloApplication application) {
//        this.application = application;
//    }
//}
//
//
package com.mediaplayer.javamediaplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button chooseFile;
    private MediaPlayer mediaPlayer;
    private Login loginController;

    private HelloApplication application;

    @FXML
    void chooseFile(MouseEvent event) {
        // Your chooseFile method implementation
    }

    // Other event handler methods here...

    @FXML
    private void loginButtonClicked(ActionEvent event) {
        // Perform login validation here

        // Assuming login is successful, close the current window and open the home page
        closeCurrentWindow(event);
        openHomePage();
    }

    private void closeCurrentWindow(ActionEvent event) {
        // Get the current stage (window)
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Close the current stage
        stage.close();
    }


    public void setApplication(HelloApplication application) {
          this.application = application;
    }
    private void openHomePage() {
        try {
            // Load the FXML file for the home page
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home-page.fxml"));
            Parent root = loader.load();

            // Create a new stage for the home page
            Stage stage = new Stage();
            stage.setTitle("Home Page");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
