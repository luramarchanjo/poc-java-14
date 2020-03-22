package com.example;

public class RecordMain {

  public static void main(String[] args) {
    var entity = new RecordEntity("Luram Archanjo", 24);
    var otherEntity = new RecordEntity("Luram Archanjo", 24);

    System.out.println(entity);
    System.out.println(entity.name());
    System.out.println(entity.age());
    System.out.println(entity.toString());
    System.out.println(entity.hashCode());
    System.out.println(entity.equals(otherEntity));
  }

}
