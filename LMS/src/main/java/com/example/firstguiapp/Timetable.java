package com.example.firstguiapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public  class Timetable extends Application{
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("timetable.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 822, 367);
        stage.setTitle("Timetable");
        stage.setScene(scene);
        stage.show();
    }







}
