package com.example;

public class PatternMatching {

  public static void main(String[] args) {
    var someString = "Luram Archanjo";

    // Old way
    if (someString instanceof String) {
      var castedObject = (String) someString;
      System.out.println(castedObject.length());
    }

    // New way
    if (someString instanceof String castedObject){
      System.out.println(castedObject.length());
    } else{
      System.out.println("The object is not a String");
    }

    // Advanced
    if (someString instanceof String castedObject && castedObject.length() > 5){
      System.out.println("Object has more than 5 characters");
    } else{
      System.out.println("Object has less than 5 characters");
    }
  }

}
