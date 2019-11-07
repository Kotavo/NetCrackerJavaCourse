package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.font.Decoration;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text textText;

    @FXML
    private ChoiceBox<String> taskChoiceBox;

    @FXML
    private ChoiceBox<String> subTaskChoiceBox;

    @FXML
    private ChoiceBox<String> subTaskChoiceBox2;

    @FXML
    private TextArea outTextFrame;

    @FXML
    private Button runButton;

    @FXML
    void initialize() {
        assert taskChoiceBox != null : "fx:id=\"taskChoiceBox\" was not injected: check your FXML file 'sample.fxml'.";
        assert outTextFrame != null : "fx:id=\"outTextFrame\" was not injected: check your FXML file 'sample.fxml'.";
        assert runButton != null : "fx:id=\"runButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert subTaskChoiceBox != null : "fx:id=\"subTaskChoiceBox\" was not injected: check your FXML file 'sample.fxml'.";
        assert subTaskChoiceBox2 != null : "fx:id=\"subTaskChoiceBox2\" was not injected: check your FXML file 'sample.fxml'.";
        assert textText != null : "fx:id=\"textText\" was not injected: check your FXML file 'sample.fxml'.";

        subTaskChoiceBox.setVisible(false);
        subTaskChoiceBox2.setVisible(false);
        textText.setVisible(false);


        taskChoiceBox.setItems(FXCollections.observableArrayList(
                "Arrays sorting",
                "Calculation of n! factorial",
                "Drawing shapes using nested loops",
                "Tasks on one-dimensional arrays",
                "Tasks on two-dimensional arrays"));

        subTaskChoiceBox.setItems(FXCollections.observableArrayList(
                "Output array in ascending and descending order",
                "Output the number of even and odd elements",
                "Replace each element with odd index by 0",
                "Replace each element with odd index by 0",
                "Search for avg of elements ",
                "Found most often elements"
        ));

        subTaskChoiceBox2.setItems(FXCollections.observableArrayList(
                "Find the sum and multi of diagonal elements",
                "Find max element id",
                "Index of the row with the largest product of elements",
                "Sort each row descending"

        ));

/*
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/SecondScene.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();

        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("/sample/ThridScene.fxml"));
        try {
            loader2.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root2 = loader2.getRoot();
*/



        taskChoiceBox.setOnAction(event -> {

           if(taskChoiceBox.getValue().equals("Tasks on one-dimensional arrays")){
               subTaskChoiceBox2.setVisible(false);
               subTaskChoiceBox.setVisible(true);
               textText.setVisible(true);
           }

           if (taskChoiceBox.getValue().equals("Tasks on two-dimensional arrays")){
               subTaskChoiceBox.setVisible(false);
               subTaskChoiceBox2.setVisible(true);
               textText.setVisible(true);
           }

            if (taskChoiceBox.getValue().equals("Arrays sorting")){
                subTaskChoiceBox.setVisible(false);
                subTaskChoiceBox2.setVisible(false);
                textText.setVisible(false);
            }

            if (taskChoiceBox.getValue().equals("Calculation of n! factorial")){
                subTaskChoiceBox.setVisible(false);
                subTaskChoiceBox2.setVisible(false);
                textText.setVisible(false);
            }

            if (taskChoiceBox.getValue().equals("Drawing shapes using nested loops")){
                subTaskChoiceBox.setVisible(false);
                subTaskChoiceBox2.setVisible(false);
                textText.setVisible(false);
            }
       });




        runButton.setOnAction(event -> {
            if(taskChoiceBox.getValue().equals("Calculation of n! factorial") ){


            }
            if(taskChoiceBox.getValue().equals("Arrays sorting") ){
                System.out.println("IasdasdsafaRKING");

            }

        });



    }
}

