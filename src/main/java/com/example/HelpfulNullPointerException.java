package com.example;

public class HelpfulNullPointerException {

  public static class SomeClass {

    public Integer[][] values = {null};

  }

  public static void main(String[] args) {
    var someObject = new SomeClass();
    someObject.values[0][0].doubleValue();
  }

}
