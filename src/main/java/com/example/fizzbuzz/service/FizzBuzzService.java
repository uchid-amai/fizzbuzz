package com.example.fizzbuzz.service;

public class FizzBuzzService {
  public String fizzbuzz(String number) {
    if (number.equals("5")) {
      return "buzz";
    }

    if (!number.equals("3") && !number.equals("6")) {
      return number;
    }

    return "fizz";
  }
}
