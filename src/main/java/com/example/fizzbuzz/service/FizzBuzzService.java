package com.example.fizzbuzz.service;

public class FizzBuzzService {
  public String fizzbuzz(String number) {
    if (!number.equals("3")) {
      return number;
    }

    return "fizz";
  }
}
