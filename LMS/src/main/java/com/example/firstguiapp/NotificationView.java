package com.example.firstguiapp;

import com.example.firstguiapp.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
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
        Alert notification = new Alert(Alert.AlertType.INFORMATION, "Dear Students,\n" +
                "\n" +
                "Your Midterm Marks have been published to the LMS\n" +
                "Next Monday and for a week you will be allowed to appeal if you feel you have an issue with your total mark\n" +
                "We will send you a link to an electronic form to fill for the appeal which will be handled by the academic affairs\n" +
                "Thank you", ButtonType.CLOSE);
        notification.setTitle("Wellcome to Student News");
        notification.setHeaderText("Midterm Results!!!");



        notification.show();
    }
}
