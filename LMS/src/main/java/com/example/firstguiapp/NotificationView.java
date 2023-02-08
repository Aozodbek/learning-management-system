package com.example.firstguiapp;

import com.example.firstguiapp.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificationView extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NotificationView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NotificationView");
        stage.setScene(scene);
        stage.show();

    }


    public void btcnotification(ActionEvent actionEvent) {
        Alert notification = new Alert(Alert.AlertType.INFORMATION, "Close the page!!!", ButtonType.CLOSE);
        notification.setTitle("Wellcome to Student News");
        notification.setHeaderText("Wellcome to Student News");

        notification.show();
    }
}
