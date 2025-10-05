package com.example.fizzbuzz.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzBuzzServiceTest {

  @Test
  @Description("1を渡したら1が返ってくること")
  public void test01() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("1");

    assertEquals("1", actual);
  }
  
  @Test
  @Description("2を渡したら2が返ってくること")
  public void test02() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("2");

    assertEquals("2", actual);
  }

  @Test
  @Description("3を渡したらfizzが返ってくること")
  public void test03() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("3");

    assertEquals("fizz", actual);
  }

  @Test
  @Description("4を渡したら4が返ってくること")
  public void test04() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("4");

    assertEquals("4", actual);
  }

  @Test
  @Description("5を渡したらbuzzが返ってくること")
  public void test05() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("5");

    assertEquals("buzz", actual);
  }

  @Test
  @Description("6を渡したらfizzが返ってくること")
  
  public void test06() {
	    FizzBuzzService target = new FizzBuzzService();
	    String actual = target.fizzbuzz("6");

	    assertEquals("fizz", actual);
	  }
}
