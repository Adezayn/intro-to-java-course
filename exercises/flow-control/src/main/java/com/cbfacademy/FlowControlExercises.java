package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> lStringsList = new LinkedList<>();
       for(int i = 0; i < numbers.size(); i++){
       if(numbers.get(i) % 5 == 0 && numbers.get(i) % 3 == 0){
            lStringsList.add("FizzBuzz");
         }else if(numbers.get(i) % 3 == 0){
            lStringsList.add("Fizz");
        }else if(numbers.get(i) % 5 == 0){
            lStringsList.add("Buzz");
         }else{
            lStringsList.add(String.valueOf(numbers.get(i)));
         }
       }
        System.out.println(lStringsList + "::: lstringslist");
         return lStringsList;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        String value;
        switch (number) {
            case 1:
             value = "January";
            break;
            case 2:
             value = "February";
            break;
            case 3:
             value = "March";
            break;
            case 4:
             value = "April";
            break;
            case 5:
             value = "May";
            break;
            case 6:
             value = "June";
            break;
            case 7:
             value = "July";
            break;
            case 8:
             value = "August";
            break;
            case 9:
             value = "September";
            break;
            case 10:
             value = "October";
            break;
            case 11:
             value = "November";
            break;
            case 12:
             value = "December";
            break;
            default:
            value = "Invalid month number";
        }
        System.out.println(value + " ::: value of month");
        return value;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> lIntegers = new LinkedList<>();
        int calculatedSumOfEvens = 0;
        int calculatedSumOfOdds = 0;
        int numbers = 1;
        while(numbers <= 100){
            lIntegers.add(numbers);
            ++numbers;
        }
        //  - determines the sum of all the even numbers in the list
        for(int i = 0; i < lIntegers.size(); i++){
            if(lIntegers.get(i) % 2 == 0){
                calculatedSumOfEvens += lIntegers.get(i);
            }
        }
        System.out.println(calculatedSumOfEvens + "final even sum value");

        //  - determines the sum of all the odd numbers in the list
        for(int i = 0; i < lIntegers.size(); i++){
            if(lIntegers.get(i) % 2 == 1){
                calculatedSumOfOdds += lIntegers.get(i);
            }
        }
        System.out.println(calculatedSumOfOdds + "final odd sum value");
      
        Map<String, Integer> map = new HashMap<>();
        map.put("SumOfEvens", calculatedSumOfEvens);
        map.put("SumOfOdds", calculatedSumOfOdds);
        return map;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        System.out.println(numbers + " ::: numbers");

        List<Integer> reverseNumbers = new LinkedList<>();
        //  - it returns the list in reverse order
        for(int i = numbers.size() - 1; i >= 0; i--){
           reverseNumbers.add(numbers.get(i));
        }
        System.out.println(reverseNumbers + " ::: reverseNumbers");

        return reverseNumbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
