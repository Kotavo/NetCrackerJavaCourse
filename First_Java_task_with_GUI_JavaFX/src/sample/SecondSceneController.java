package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class SecondSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> taskChoiceBox;

    @FXML
    private ChoiceBox<String> subTaskChoiceBox;

    @FXML
    private TextArea outTextFrame;

    @FXML
    private Button runButton;

    @FXML
    void initialize() {
        assert taskChoiceBox != null : "fx:id=\"taskChoiceBox\" was not injected: check your FXML file 'SecondScene.fxml'.";
        assert subTaskChoiceBox != null : "fx:id=\"subtaskChoiceBox\" was not injected: check your FXML file 'SecondScene.fxml'.";
        assert outTextFrame != null : "fx:id=\"outTextFrame\" was not injected: check your FXML file 'SecondScene.fxml'.";
        assert runButton != null : "fx:id=\"runButton\" was not injected: check your FXML file 'SecondScene.fxml'.";
        taskChoiceBox.setValue("Arrays sorting");
        taskChoiceBox.setItems(FXCollections.observableArrayList(
                "Arrays sorting",
                "Calculation of n! factorial",
                "Drawing shapes using nested loops",
                "Tasks on one-dimensional arrays",
                "Task on two-dimensional arrays"));

        subTaskChoiceBox.setItems(FXCollections.observableArrayList(
                "Output array in ascending and descending order",
                        "Output the number of even and odd elements",
                        "Replace each element with odd index by 0",
                        "Replace each element with odd index by 0",
                        "Search for avg of elements ",
                        "Found most often elements"
        ));

    }
}
