package com.testng.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class AddCartAmazon {
	WebDriver driver;
  @Test
  public void AddCart() {
	
	  try {
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  
	  System.out.println("Title : "+driver.getTitle());
	  System.out.println("*****************************************");
	  
//	  Search Bar
	  
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus");
	  System.out.println("Search bar");
	  
//	  Search Button
	  
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	  System.out.println("searching...");
	  
//	  open 
	  
	  driver.findElement(By.linkText("OnePlus Nord N20 5G |Android Smart Phone |6.43\" AMOLED Display|6+128GB |U.S. Unlocked |4500 mAh Battery | 33W Fast Charging | Blue Smoke")).click();
	  System.out.println("view the mobile details");
	  
//	  Add to Cart
	  
//	  driver.findElement(By.id("add-to-cart-button")).click();
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  System.out.println("add to cart successfully");
	  
//	  Screenshot
	  
	  TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("C://Users//BoobalanRaj//Pictures//Screenshots//Amazon.png"));
			System.out.println("Screenshot taken successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
//	 close browser
	  
	  driver.close();
	  System.out.println("browser closed successfully");
	  
	  }
	  catch(NoSuchElementException e) {
			e.printStackTrace();
		}
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Java FSD Software\\chrome\\chromedriver.exe");
	  driver =new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver = null;
  }

}
