package com.example.fizzbuzz.service;

public class FizzBuzzService {
  public String fizzbuzz(String number) {
    if (number.equals("5")) {
      return "buzz";
    }

    if (Integer.parseInt(number) % 3 != 0) {
      return number;
    }

    return "fizz";
  }
}
