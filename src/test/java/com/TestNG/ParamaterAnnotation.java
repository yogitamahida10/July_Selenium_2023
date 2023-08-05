package com.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParamaterAnnotation {
  @Test
  @Parameters({"url"})
  public void ParametersTest(String url) {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver Driver=new ChromeDriver();
	  Driver.get(url);
	  Driver.manage().window().maximize();
	  System.out.println("Launching Browser");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
