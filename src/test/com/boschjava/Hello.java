package com.boschjava;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Hello {
  @Test(priority = 1)
  public void f() {
	  System.out.print("I am first test and priority 1");
  }
  @Test(priority = 2)
  public void f() {
	  System.out.print("I am second test and priority 2");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.print("I am before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.print("I am after test");
  }

}
