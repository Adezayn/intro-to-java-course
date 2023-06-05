package com.cbfacademy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("\n");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(15);
        linkedList.add(45);
        linkedList.add(9);
        linkedList.add(60);
        linkedList.add(25);
        linkedList.add(17);
        linkedList.add(30);
        linkedList.add(29);
        linkedList.add(7);

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.add(6);
        intArray.add(7);
        intArray.add(8);
        intArray.add(9);

        FlowControlExercises flowControlExercises = new FlowControlExercises();
        flowControlExercises.fizzBuzz(linkedList);
        System.out.println("\n");
        flowControlExercises.whichMonth(6);
        flowControlExercises.whichMonth(20);
        flowControlExercises.whichMonth(8);
        flowControlExercises.whichMonth(1);
        flowControlExercises.whichMonth(37);
        System.out.println("\n");
        flowControlExercises.sumOfOddsAndSumOfEvens();
        System.out.println("\n");
        flowControlExercises.reverse(intArray);
    }
}
