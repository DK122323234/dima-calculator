package com.example.dimacalculator;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Answer {
    public String anAnswer(String example) {
        double result = 1;
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        String[] numbers = example.split(" ");

        for (int i = 0; i < numbers.length; i++) {

              if (numbers[i].equals("/")) {
                  if(numbers[i+1].equals("0")) {
                      return "Делить на 0 нельзя";
                  }
                  numbers[i + 1] = String.valueOf(Double.valueOf(numbers[i - 1]) / Double.valueOf(numbers[i + 1]));
                  numbers[i - 1] = null;
                  numbers[i] = null;
          }
        }
        for (String number : numbers) {
            if (number != null) {
                list.add(number);
            }
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals("*")) {

                list.set(i + 1, String.valueOf(Double.valueOf(list.get(i - 1)) * Double.valueOf(list.get(i + 1))));
               list.set(i - 1, null);
                list.set(i, null);
            }
        }
        for (String number : list) {
            if (number != null) {
                list1.add(number);
            }
        }

        for (int i = 0; i < list1.size(); i++) {

            if (list1.get(i).equals("-")) {

                list1.set(i + 1, String.valueOf(Double.valueOf(list1.get(i - 1)) - Double.valueOf(list1.get(i + 1))));
                list1.set(i - 1, null);
                list1.set(i, null);
            }
        }
        for (String number : list1) {
            if (number != null) {
                list2.add(number);
            }
        }
        for (int i = 0; i < list2.size(); i++) {

            if (list2.get(i).equals("+")) {

                list2.set(i + 1, String.valueOf(Double.valueOf(list2.get(i - 1)) + Double.valueOf(list2.get(i + 1))));
                list2.set(i - 1, null);
                list2.set(i, null);
            }
        }

               return  list2.get(list2.size() - 1);
    }
}



