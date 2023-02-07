package com.example.firstguiapp;

import com.example.firstguiapp.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificationView extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NotificationView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 590, 400);
        stage.setTitle("NotificationView");
        stage.setScene(scene);
        stage.show();

    }
    public void showmessage (){
        Alert notification = new Alert(Alert.AlertType.INFORMATION, "Don't touch,", ButtonType.CLOSE);
        notification.show();
    }

    public void btcnotification(ActionEvent actionEvent) {
        Alert notification = new Alert(Alert.AlertType.INFORMATION, "Don't touch,", ButtonType.CLOSE);
        notification.show();

    }
}
