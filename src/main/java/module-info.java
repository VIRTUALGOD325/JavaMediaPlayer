module com.mediaplayer.javamediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.mediaplayer.javamediaplayer to javafx.fxml;
    exports com.mediaplayer.javamediaplayer;
}