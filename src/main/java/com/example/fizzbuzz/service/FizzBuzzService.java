package com.example.fizzbuzz.service;

public class FizzBuzzService {
  public String fizzbuzz(String number) {
	  String buzz = "buzz";
	  String fizz = "fizz";
	
    if  (Integer.parseInt(number) % 5 == 0) {
    	return  buzz;
    }

    if (Integer.parseInt(number) % 3 == 0) {
    	return   fizz;
    }
    
	if (Integer.parseInt(number) % 15 == 0 ) {

		return  buzz + fizz;
	 }
  
    return number;
  }
}
