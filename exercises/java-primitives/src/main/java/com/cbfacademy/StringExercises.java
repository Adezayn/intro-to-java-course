package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        // String stringValue =  String.join("", String.valueOf(characters));
        String stringValue = String.valueOf(characters);
       return stringValue;
        // throw new RuntimeException("Not implemented");
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        char[] characterOfStrings = text.toCharArray();
        long countIdenticalCharacter = 0;
        for(int i = 0; i < text.length(); i++){
             if(characterOfStrings[i] == character){
              countIdenticalCharacter++;
             }
        }
        System.out.println(countIdenticalCharacter + " is the number of " + character + " present.");
        return countIdenticalCharacter;
        // throw new RuntimeException("Not implemented");
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        StringBuilder sb = new StringBuilder(word);
        String reverseWord = sb.reverse().toString();
      if(word.equals(reverseWord)){
        System.out.println("true");
        return true;
      }
      System.out.println("false");
      return false;
    }

    public String getName() {
        return "String Exercises";
    }

    public void fromCharacters(char c, char d, char e, char f) {
    }
}