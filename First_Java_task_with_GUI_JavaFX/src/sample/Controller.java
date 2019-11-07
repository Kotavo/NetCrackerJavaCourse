package sample;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import LogicalPath.MyArrays;
import LogicalPath.MyFactorial;
import LogicalPath.OneDimensionalArray;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyIntegerProperty;
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
    private TextField inputNField;

    @FXML
    public TextArea outTextFrame;

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
        assert inputNField != null : "fx:id=\"inputNField\" was not injected: check your FXML file 'sample.fxml'.";


        subTaskChoiceBox.setVisible(false);
        subTaskChoiceBox2.setVisible(false);
        textText.setVisible(false);
        inputNField.setVisible(false);





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
                "Search for max and min",
                "Search for avg of elements of each array",
                "Found most often elements"
        ));

        subTaskChoiceBox2.setItems(FXCollections.observableArrayList(
                "Find the sum and multi of diagonal elements",
                "Find max element id",
                "Index of the row with the largest product of elements",
                "Sort each row descending"

        ));



        taskChoiceBox.setOnAction(event -> {

           if(taskChoiceBox.getValue().equals("Tasks on one-dimensional arrays")){
               subTaskChoiceBox2.setVisible(false);
               inputNField.setVisible(false);
               subTaskChoiceBox.setVisible(true);
               textText.setVisible(true);
           }

           if (taskChoiceBox.getValue().equals("Tasks on two-dimensional arrays")){
               subTaskChoiceBox.setVisible(false);
               inputNField.setVisible(false);
               subTaskChoiceBox2.setVisible(true);
               textText.setVisible(true);
           }

            if (taskChoiceBox.getValue().equals("Arrays sorting")){
                subTaskChoiceBox.setVisible(false);
                subTaskChoiceBox2.setVisible(false);
                textText.setVisible(false);
                inputNField.setVisible(true);
            }

            if (taskChoiceBox.getValue().equals("Calculation of n! factorial")){
                subTaskChoiceBox.setVisible(false);
                subTaskChoiceBox2.setVisible(false);
                textText.setVisible(false);
                inputNField.setVisible(true);
            }

            if (taskChoiceBox.getValue().equals("Drawing shapes using nested loops")){
                subTaskChoiceBox.setVisible(false);
                subTaskChoiceBox2.setVisible(false);
                textText.setVisible(false);
                inputNField.setPromptText("Input size");
                inputNField.setVisible(true);
            }
       });

        runButton.setOnAction(event -> {
            if(taskChoiceBox.getValue().equals("Calculation of n! factorial") ){
            String scan;
            scan = inputNField.getText();
            int n = Integer.parseInt(scan);
            outTextFrame.clear();
                long facResult = 0;
                long startTime4 = System.nanoTime();
                facResult = MyFactorial.loopFactorial(n);
                long estimatedTime4 = System.nanoTime() - startTime4;
                outTextFrame.setText("Result of loopFactorial method: " + facResult);

                long startTime5 = System.nanoTime();
                facResult = MyFactorial.recursionFactorial(n);
                long estimatedTime5 = System.nanoTime() - startTime5;
                outTextFrame.appendText("\n" + "Result of recursionFactorial method: " + facResult);
                outTextFrame.appendText("\n" + "loopFactorial method time: " + estimatedTime4 +
                        "\n" + "recursionFactorial method time: " + estimatedTime5 +
                        "\n" + "better time: " + Math.min(estimatedTime4, estimatedTime5) + "\n");

            }
            if(taskChoiceBox.getValue().equals("Arrays sorting") ){
                String scan;
                scan = inputNField.getText();
                int n = Integer.parseInt(scan);
                outTextFrame.clear();
                int[] arr1 = new int[n];
                int[] arr2 = new int[n];
                int[] arr3 = new int[n];
                MyArrays.randomIntValues(arr1, 0, 100);
                arr2 = Arrays.copyOf(arr1, arr2.length);
                arr3 = Arrays.copyOf(arr1, arr3.length);

                outTextFrame.appendText("Initial array: " + "\n" + Arrays.toString(arr1));
                long startTime1 = System.nanoTime();
                MyArrays.selectionSort(arr1);
                double estimatedTime1 = (System.nanoTime() - startTime1 / 1000000.0);
                outTextFrame.appendText( "\n" + "Result of Selection sort: " + "\n" + Arrays.toString(arr1));


                long startTime2 = System.nanoTime();
                MyArrays.intBubbleSort(arr2);
                double estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
                outTextFrame.appendText( "\n" + "Result of Bubble sort: " + "\n" + Arrays.toString(arr2));


                long startTime3 = System.nanoTime();
                Arrays.sort(arr3);
                double estimatedTime3 = (System.nanoTime() - startTime3) / 1000000.0;
                outTextFrame.appendText( "\n" + "Result of Array.sort: " + "\n" + Arrays.toString(arr3));


                outTextFrame.appendText( "\n" + "\n" + "Selection sort time: " + estimatedTime1 + " millisec" + "\n"
                        + "Bubble sort time: " + estimatedTime2 + " millisec" + "\n"
                        + "Arrays.sort time: " + estimatedTime3 + " millisec" + "\n");

                double result = Math.min(estimatedTime1, estimatedTime2);
                result = Math.min(result, estimatedTime3);
                outTextFrame.appendText( "\n" + "Better time: " + result + " millisec");

            }

            if (taskChoiceBox.getValue().equals("Drawing shapes using nested loops")){
                String scan;
                scan = inputNField.getText();
                int n = Integer.parseInt(scan);
                outTextFrame.clear();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        outTextFrame.appendText("# ");
                    }
                    outTextFrame.appendText("\n");
                }

                outTextFrame.appendText("\n");

                for (int i = 1; i <= 8; i++) {
                        for (int j = 1; j <= i; j++) {
                            outTextFrame.appendText("# ");
                        }
                         outTextFrame.appendText("\n");
                }
                outTextFrame.appendText("\n");



                    for(int i = 1; i <= 8; i++){
                        for(int j = 8; j >= 1; --j){
                            if(j < i){
                                outTextFrame.appendText(" ");
                            }
                            else{
                                outTextFrame.appendText("# ");
                            }
                        }
                        outTextFrame.appendText("\n");
                    }
                 outTextFrame.appendText("\n");



                    for(int i = 1; i <= 8; i++){
                        for(int j = 8; j >= 1; --j){
                            if(j > i){
                                outTextFrame.appendText(" ");
                            }
                            else{
                                outTextFrame.appendText("# ");
                            }
                        }
                        outTextFrame.appendText("\n");
                    }
                outTextFrame.appendText("\n");



                    for(int i = 1; i <= 8; i++){
                        switch (i){
                            case 1:
                                outTextFrame.appendText("# # # # # # # #");
                                break;
                            case 8:
                                outTextFrame.appendText("\n");
                                outTextFrame.appendText("# # # # # # # #");
                                break;
                            default:
                                outTextFrame.appendText("\n");
                                outTextFrame.appendText("#                    #");
                                break;
                        }
                    }






            }

            if (taskChoiceBox.getValue().equals("Tasks on one-dimensional arrays")){
                outTextFrame.clear();
                if (subTaskChoiceBox.getValue().equals("Output array in ascending and descending order")){
                    int[] oddArr = new int[50];
                    OneDimensionalArray.getOddValue(oddArr);
                    outTextFrame.appendText("Ascending odd array: ");
                    outTextFrame.appendText("\n" + Arrays.toString(oddArr));
                    outTextFrame.appendText("\n");
                    outTextFrame.appendText("Descending odd arrays: " + "\n");
                    OneDimensionalArray.reverseValue(oddArr);
                    outTextFrame.appendText(Arrays.toString(oddArr));

                }
                if (subTaskChoiceBox.getValue().equals("Output the number of even and odd elements")){
                    int[] testArr = new int[20];
                    String result = "";
                    MyArrays.randomIntValues(testArr, 0, 10);
                    outTextFrame.appendText("Starting Array: " + "\n");
                    outTextFrame.appendText(Arrays.toString(testArr));
                    outTextFrame.appendText("\n");
                    result = OneDimensionalArray.oddAndEvenElementsOnArray(testArr,result);
                    outTextFrame.appendText(result);

                }

                if (subTaskChoiceBox.getValue().equals("Replace each element with odd index by 0")){
                    int[] anotherTestArr = new int[10];
                    MyArrays.randomIntValues(anotherTestArr, 0, 100);
                    outTextFrame.appendText("Starting Array: " + "\n");
                    outTextFrame.appendText(Arrays.toString(anotherTestArr));
                    outTextFrame.appendText("\n");
                    anotherTestArr = OneDimensionalArray.replaseOddValues(anotherTestArr);
                    outTextFrame.appendText("Result of replace" + '\n');
                    outTextFrame.appendText(Arrays.toString(anotherTestArr));
                }

                if (subTaskChoiceBox.getValue().equals("Search for max and min")){
                    int[] arr5 = new int[15];
                    String result ="";
                    MyArrays.randomIntValues(arr5, -50, 50);
                    outTextFrame.appendText("Starting Array: " + "\n");
                    outTextFrame.appendText(Arrays.toString(arr5));
                    outTextFrame.appendText("\n");
                    result = OneDimensionalArray.minMaxAndEntryOfelements(arr5,result);
                    outTextFrame.appendText(result);
                }

                if (subTaskChoiceBox.getValue().equals("Search for avg of elements of each array")){
                    int[] arr6 = new int[10];
                    int[] arr7 = new int[10];
                    MyArrays.randomIntValues(arr6, 0, 10);
                    MyArrays.randomIntValues(arr7, 0, 10);
                    outTextFrame.appendText("First array: " + "\n");
                    outTextFrame.appendText(Arrays.toString(arr6));
                    outTextFrame.appendText("\n");
                    outTextFrame.appendText("Second array: " + "\n");
                    outTextFrame.appendText(Arrays.toString(arr7));
                    outTextFrame.appendText("\n");
                    float avg1 = MyArrays.arrayAvg(arr6);
                    float avg2 = MyArrays.arrayAvg(arr7);
                    outTextFrame.appendText("Avg1: " + avg1 + "\n");
                    outTextFrame.appendText("Avg2: " + avg2 + "\n");
                    if (avg1 == avg2) {
                        outTextFrame.appendText("Avg1 = Avg2");
                    } else {
                        if (avg1 > avg2) {
                            outTextFrame.appendText("The biggest avg is avg1 = " + avg1);
                        } else {
                            outTextFrame.appendText("The biggest avg is avg2 = " + avg2);
                        }
                    }
                }
                if(subTaskChoiceBox.getValue().equals("Found most often elements")){
                    int[] arr8 = new int[20];
                    String result ="";
                    MyArrays.randomIntValues(arr8, -1, 1);
                    outTextFrame.appendText("Starting array: " + "\n");
                    outTextFrame.appendText(Arrays.toString(arr8));
                    outTextFrame.appendText("\n");
                    result = OneDimensionalArray.whichElement(arr8,result);
                    outTextFrame.appendText(result);
                }

            }

            if (taskChoiceBox.getValue().equals("Tasks on two-dimensional arrays")){
                if (subTaskChoiceBox2.getValue().equals("Find the sum and multi of diagonal elements")){

                }

                if (subTaskChoiceBox2.getValue().equals("Find max element id")){

                }

                if (subTaskChoiceBox2.getValue().equals("Index of the row with the largest product of elements")){

                }

                if (subTaskChoiceBox2.getValue().equals("Sort each row descending")){

                }



            }

        });




    }

}

