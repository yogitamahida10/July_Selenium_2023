package com.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAmazon {
  @Test
  public void LaunchingTestNgWebsite() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver Driver= new ChromeDriver();
	  Driver.get("https://www.amazon.ca/");
	  Driver.manage().window().maximize();
	  String Title= Driver.getTitle();
	  System.out.println("titile:"+Title);
	 Assert.assertEquals(Title,"Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	  
	  
  } 
  @Test(priority=1)
  public void Testcase2() {
	  System.out.println("Inside Testcase2");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
