package com.example.fizzbuzz.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

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
  @Description("5の倍数を渡したらbuzzが返ってくること")
  public void test03() {
    FizzBuzzService target = new FizzBuzzService();
    String actual5 = target.fizzbuzz("5");
    String actual10 = target.fizzbuzz("10");
    String actual20 = target.fizzbuzz("20");

    assertEquals("buzz", actual5);
    assertEquals("buzz", actual10);
    assertEquals("buzz", actual20);
  }
  

  @Test
  @Description("15を渡したらfizzbuzzが返ってくること")
  public void test05() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("15");

    assertEquals("fizzbuzz", actual);
  }
  

  @Test
  @Description("30を渡したらfizzbuzzが返ってくること")
  public void test06() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("30");

    assertEquals("fizzbuzz", actual);
}
}
