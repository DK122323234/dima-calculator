package com.example.dimacalculator;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Answer {
    public String anAnswer(String example) {
        double result = 1;

       List<Double> numbersAddition = new ArrayList<>();
       List<Double> numbersSubtraction = new ArrayList<>();
       List<Double> numbersMultiplication = new ArrayList<>();
       List<Double> numbersDivision = new ArrayList<>();


        String[] numbers = example.split(" ");

            for (int i = 0; i < numbers.length; i++) {
                switch (numbers[i]) {
                    case "*":
                        numbersMultiplication.add(Double.valueOf(numbers[i + 1]));
                        break;

                        case "/":
                            if (numbers[i + 1].equals("0")) {
                                return "Делить на 0 нельзя";
                            }
                            numbersDivision.add(Double.valueOf(numbers[i + 1]));
                            break;

                            case "+":
                                numbersAddition.add(Double.valueOf(numbers[i + 1]));
                                break;

                                case "-":
                                 numbersSubtraction.add(Double.valueOf(numbers[i + 1]));
                                 break;
                }
            }
        result = Double.valueOf(numbers[0]);

            for (double number : numbersMultiplication) {
                result = result * number;
            }

            for (double number : numbersDivision) {
                result = result / number;
            }

            for (double number : numbersAddition) {
                result = result + number;
            }

            for (double number : numbersSubtraction) {
                result = result - number;
            }





        return String.valueOf(result );
    }
}



