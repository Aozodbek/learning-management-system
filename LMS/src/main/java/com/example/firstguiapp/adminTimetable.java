package com.example.firstguiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;


public class adminTimetable {
    @FXML
    private Button myButton1;

    @FXML
    public ChoiceBox choice;


    @FXML
    private TextField subject;

    @FXML
    private TextField subject1;

    @FXML
    private TextField subject2;

    @FXML
    private TextField subject3;

    @FXML
    private TextField subject4;

    @FXML
    private TextField subject5;

    @FXML
    private TextField subject6;

    @FXML
    private TextField subject7;
    @FXML
    private TextField subject8;
    @FXML
    private TextField subject9;
    @FXML
    private TextField subject10;
    @FXML
    private TextField subject11;
    @FXML
    private TextField subject12;
    @FXML
    private TextField subject13;
    @FXML
    private TextField subject14;
    @FXML
    private TextField subject15;
    @FXML
    private TextField subject16;
    @FXML
    private TextField subject17;
    @FXML
    private TextField subject18;
    @FXML
    private TextField subject19;
    @FXML
    private TextField subject20;
    @FXML
    private TextField subject21;
    @FXML
    private TextField subject22;
    @FXML
    private TextField subject23;

    String subjects[] = new String[15];

    String colours[] = new String[16];

    String[] stringArray = new String[15];


    String[] subjectFiles = new String[countLines("src/files/subjectSource.csv")];

    String[] groups = new String[countLines("src/files/groups.csv")];

    public adminTimetable() throws IOException {
    }


    protected void displaySchedule() throws FileNotFoundException {

        File colors = new File("files/colours.csv");
        Scanner input = new Scanner(colors);
        for (int i = 0; i < colours.length; i++) {
            colours[i] = input.next();
        }

        // filling subjects array with text
        subjects[0] = subject.getText();
        subjects[1] = subject1.getText();
        subjects[2] = subject2.getText();
        subjects[3] = subject3.getText();
        subjects[4] = subject4.getText();

        subjects[5] = subject8.getText();
        subjects[6] = subject10.getText();
        subjects[7] = subject11.getText();
        subjects[8] = subject12.getText();
        subjects[9] = subject14.getText();

        subjects[10] = subject17.getText();
        subjects[11] = subject19.getText();
        subjects[12] = subject20.getText();
        subjects[13] = subject21.getText();
        subjects[14] = subject23.getText();

       // loop for giving the same colour to same subjects
        for (int i = 0; i < subjects.length; i++) {
            for (int j = i + 1; j < subjects.length; j++) {
                if (subjects[i].equals(subjects[j]))
                    colours[i] = colours[j];
            }
        }

        // loop to assign white colour if the subject is empty
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals(" ")) {
                colours[i] = colours[15];

            }
        }

        // giving colour to subjects
        subject.setStyle("-fx-background-color: " + colours[0]);
        subject1.setStyle("-fx-background-color:" + colours[1]);
        subject2.setStyle("-fx-background-color:" + colours[2]);

        subject3.setStyle("-fx-background-color: " + colours[3]);
        subject4.setStyle("-fx-background-color:" + colours[4]);
        subject8.setStyle("-fx-background-color:" + colours[5]);

        subject10.setStyle("-fx-background-color: " + colours[6]);
        subject11.setStyle("-fx-background-color:" + colours[7]);
        subject12.setStyle("-fx-background-color:" + colours[8]);

        subject14.setStyle("-fx-background-color: " + colours[9]);
        subject17.setStyle("-fx-background-color:" + colours[10]);
        subject19.setStyle("-fx-background-color:" + colours[11]);

        subject20.setStyle("-fx-background-color: " + colours[12]);
        subject21.setStyle("-fx-background-color:" + colours[13]);
        subject23.setStyle("-fx-background-color:" + colours[14]);

    }


    protected void showScheduleOfSelectedGroup() throws FileNotFoundException {

        File file = new File(subjectFiles[getIndex()]);
        Scanner input = new Scanner(file);

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = input.next();
            if (stringArray[i].equals("Empty"))
                stringArray[i] = " ";
        }


        subject.setText(stringArray[0]);
        subject1.setText(stringArray[1]);
        subject2.setText(stringArray[2]);
        subject3.setText(stringArray[3]);
        subject4.setText(stringArray[4]);
        //subject5.setText(stringArray[5]);
        //subject6.setText(stringArray[5]);
        //subject7.setText(stringArray[8]);
        subject8.setText(stringArray[5]);
        //subject9.setText(stringArray[8]);
        subject10.setText(stringArray[6]);
        subject12.setText(stringArray[7]);

        subject14.setText(stringArray[8]);
        //subject15.setText(stringArray[9]);
        //subject16.setText(stringArray[5]);
        subject17.setText(stringArray[9]);
        subject11.setText(stringArray[10]);
        subject19.setText(stringArray[11]);
        subject20.setText(stringArray[12]);
        subject21.setText(stringArray[13]);
        subject23.setText(stringArray[14]);
        //myChange.setEditable(false);
    }


    @FXML
    protected void onButtonClicked() throws FileNotFoundException {

        showScheduleOfSelectedGroup();
        displaySchedule();


    }
    protected void showChoice() throws FileNotFoundException {
        File file1 = new File("src/files/subjectSource.csv");
        Scanner input1 = new Scanner(file1);
        for (int i = 0; i < subjectFiles.length; i++) {
            subjectFiles[i] = input1.next();
        }

        for (int i = 0; i < groups.length; i++) {
            choice.getItems().add(groups[i]);
        }


    }

   //method to return index of group
    protected int getIndex() {
        return choice.getSelectionModel().getSelectedIndex();

    }

    // method to give values array called "groups"
    protected void showGroupsList() throws FileNotFoundException {
        File groupslist = new File("src/files/groups.csv");
        Scanner input = new Scanner(groupslist);
        for (int i = 0; i < groups.length; i++) {
            groups[i] = input.next();
        }
    }

    @FXML
    protected void onButton1Clicked(ActionEvent actionEvent) throws FileNotFoundException {

           showGroupsList();
           showChoice();
           myButton1.setDisable(true);

    }

    //count lines of file to produce size to arrays
    protected int countLines(String file1) throws IOException {


        int lines = 0;

        FileReader file = new FileReader(file1);
        BufferedReader reader = new BufferedReader(file);

        while (reader.readLine() != null) lines++;
        reader.close();
        return lines;
    }

    @FXML private Button closeButton;

    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
