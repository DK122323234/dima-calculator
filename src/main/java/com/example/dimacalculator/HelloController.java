package com.example.dimacalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    private String result = "";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label example;

    @FXML
    void delete(ActionEvent event) {
        result = "";
        example.setText(result);
    }
    @FXML
    void equals(ActionEvent event) {
        Answer answer = new Answer();
        try {
            result = answer.anAnswer(result);
        }
        catch (Exception e) {
            result = "Ошибка";
        }

         example.setText(result);
    }

    @FXML
    void erase(ActionEvent event) {
        try {
            if (result.endsWith(" ") || result.length() == 1){
                result = result.substring(0, result.length() - 3);
            }
            else if (result.equals("Делить на 0 нельзя")) {
                result = "";
            }
            else if (result.equals("Ошибка")) {
                result = "";
            }
            else {
                result = result.substring(0, result.length() - 1);
            }

            example.setText(result);
        }
        catch (Exception e) {
                System.out.println(e);
        }

    }

    @FXML
    void division(ActionEvent event) {
        if (!result.endsWith(" ") && !result.equals("")) {
            result = result + " / ";
            example.setText(result);
        }
    }

    @FXML
    void eight(ActionEvent event) {
        result = result + "8";
        example.setText(result);
    }

    @FXML
    void five(ActionEvent event) {
        result = result + "5";
        example.setText(result);
    }

    @FXML
    void four(ActionEvent event) {
        result = result + "4";
        example.setText(result);
    }

    @FXML
    void minus(ActionEvent event) {
        if (!result.endsWith(" ") && !result.equals("")){
            result = result + " - ";
            example.setText(result);
        }
    }

    @FXML
    void multiplication(ActionEvent event) {
        if (!result.endsWith(" ") && !result.equals("")) {
            result = result + " * ";
            example.setText(result);
        }
    }

    @FXML
    void negative(ActionEvent event) {
        if (result.endsWith(" ") || result.equals("") ) {
            result = result + "-";
            example.setText(result);
        }
    }

    @FXML
    void nine(ActionEvent event) {
        result = result + "9";
        example.setText(result);
    }

    @FXML
    void one(ActionEvent event) {
        result = result + "1";
        example.setText(result);

    }

    @FXML
    void percent(ActionEvent event) {
        try {
            String[] numbers = result.split(" ");
            if (!numbers[numbers.length - 1].equals("+") || !numbers[numbers.length - 1].equals("-") || !numbers[numbers.length - 1].equals("*") ||
                    !numbers[numbers.length - 1].equals("/") || !numbers[numbers.length - 1].equals("(-")) {

                System.out.println(numbers[numbers.length - 1]);
                result = String.valueOf(Double.valueOf(numbers[numbers.length - 1] ) / 100);
            }
            example.setText(result);
        }
              catch (Exception e) {
                   System.out.println(e);
              }
    }

    @FXML
    void plus(ActionEvent event) {
        if (!result.endsWith(" ") && !result.equals("")) {
            result = result + " + ";
            example.setText(result);
        }

    }

    @FXML
    void point(ActionEvent event) {
        if (!result.endsWith(" ") && !result.equals("")) {
            result = result + ".";
            example.setText(result);
        }
    }

    @FXML
    void seven(ActionEvent event) {
        result = result + "7";
        example.setText(result);
    }

    @FXML
    void six(ActionEvent event) {
        result = result + "6";
        example.setText(result);
    }

    @FXML
    void three(ActionEvent event) {
        result = result + "3";
        example.setText(result);
    }

    @FXML
    void two(ActionEvent event) {
        result = result + "2";
        example.setText(result);

    }

    @FXML
    void zero(ActionEvent event) {
          result = result + "0";
        example.setText(result);
    }

    @FXML
    void initialize() {
        assert example != null : "fx:id=\"example\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
