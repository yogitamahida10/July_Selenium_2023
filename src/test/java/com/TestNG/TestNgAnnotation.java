package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotation {
  @Test(invocationCount=2)//executing testcases 2 times; Used for executing test cases N numbers of times.
  public void Testcase1() {
	  System.out.println("	Inside Testcase1");
  }
  @Test(priority=1)
  public void testcase2() {
	  System.out.println("	Inside Testcase2");
  }
  @Test(priority=1, enabled=false)//for disable this test cases; this test case will not executed
  public void testcase3() {
	  System.out.println("	Inside Testcase3");
  }
  @Test
  public void Testcase4() {
	  System.out.println("	Inside Testcase4");
	  //Assert.assertEquals(false, true);//failing the test case
	 
	  
  }
  @Test(priority=5)
  public void Testcase5() {
	  System.out.println("	Inside Testcase5");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
