package com.example;

import java.text.NumberFormat;
import java.util.Locale;

public class AccountingCurrencyFormat {

  public static void main(String[] args) {
    Double value = 3.27;
    System.out.println(NumberFormat.getPercentInstance(Locale.US).format(value));
    System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(value));
    System.out.println(NumberFormat.getNumberInstance(Locale.US).format(value));
    System.out.println(NumberFormat.getInstance(Locale.US).format(value));
  }

}
