package com.example.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

  @Test
  @Description("3と5の倍数以外の数字を渡したら渡した数字が返ってくること")
  public void test01() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("1");
    String actual2 = target.fizzbuzz("2");
    String actual4 = target.fizzbuzz("4");

    assertEquals("1", actual);
    assertEquals("2", actual2);
    assertEquals("4", actual4);
  }

  @Test
  @Description("3の倍数を渡したらfizzが返ってくること")
  public void test02() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("3");
    String actual6 = target.fizzbuzz("6");
    String actual9 = target.fizzbuzz("9");

    assertEquals("fizz", actual);
    assertEquals("fizz", actual6);
    assertEquals("fizz", actual9);
  }


  @Test
  @Description("5を渡したらbuzzが返ってくること")
  public void test03() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("5");

    assertEquals("buzz", actual);
  }
  
  @Test
  @Description("10を渡したらbuzzが返ってくること")
  public void test04() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("10");

    assertEquals("buzz", actual);
  }
}

