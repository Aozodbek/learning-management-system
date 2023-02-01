package com.example.firstguiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentMainPage {

    public void timetable(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("timetable.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 822, 367);
        stage.setTitle("Timetable");
        stage.setScene(scene);
        stage.show();
    }

    public void courses(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Courses.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Courses");
        stage.setScene(scene);
        stage.show();
    }

    public void profile(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UserPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Courses");
        stage.setScene(scene);
        stage.show();
    }
}


