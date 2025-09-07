package com.example.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

  @Test
  @Description("1を渡したら1が返ってくること")
  public void test01() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzbuzz("1");

    assertEquals("1", actual);
  }

}
