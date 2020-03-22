package com.example;

import java.time.DayOfWeek;

public class SwitchExpressions {

  public static void main(String[] args) {
    var day = DayOfWeek.MONDAY;

    var returnValue = switch (day) {
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "It is week";
      case SATURDAY, SUNDAY -> "It is weekend";
      default -> "Day not mapped";
    };

    System.out.println(returnValue);
  }

}
