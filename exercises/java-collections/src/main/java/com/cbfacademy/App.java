package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        CollectionsExercises collectionsExercises = new CollectionsExercises();
        collectionsExercises.useLinkedList();
        collectionsExercises.useStack();
        collectionsExercises.useArrayDeque();
        collectionsExercises.useHashMap();
    }
}
