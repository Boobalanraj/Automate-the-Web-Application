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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class RegistrationOracle {
	WebDriver driver;
  @Test
  public void Oracle() throws InterruptedException {
	 try {    
	  driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		System.out.println("Title:"+driver.getTitle());
		System.out.println("**********************************");
		
//		Email Address 
		
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:email::content\"]"));
		System.out.println("Email");
		email.sendKeys("boobalan@gmail.com");
		
//		Password
		
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:password::content\"]"));
		System.out.println("Password");
		password.sendKeys("Test@123");
		
//		Retype password
		
		Thread.sleep(1000);
		WebElement retypepassword = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:retypePassword::content\"]"));
		System.out.println("Retype Password");
		retypepassword.sendKeys("Test@123");
		
//		Country
		
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:country::content\"]"));
		System.out.println("Country");
		country.sendKeys("India");
		
//		Name-firstname
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:firstName::content\"]"));
		System.out.println("First Name");
		firstname.sendKeys("Boobalan");
		
//		Name-lastname
		
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:lastName::content\"]"));
		System.out.println("Last Name");
		lastname.sendKeys("N");
		
//		Job Title
		
		Thread.sleep(1000);
		WebElement job = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:jobTitle::content\"]"));
		System.out.println("Job Title");
		job.sendKeys("Software Engineer");
		
//		Work Phone
		
		Thread.sleep(1000);
		WebElement workphone =driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:workPhone::content\"]"));
		System.out.println("Work Phone");
		workphone.sendKeys("1234567890");
		
//		Company Name
		
		Thread.sleep(1000);
		WebElement company = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:companyName::content\"]"));
		System.out.println("Company Name");
		company.sendKeys("ABC Corporation");
		
//		Address- line 1
		
		Thread.sleep(1000);
		WebElement Address1 = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:address1::content\"]"));
		System.out.println("Address- line1");
		Address1.sendKeys("15/4");
		
//		Address - line 2

		Thread.sleep(1000);
		WebElement Address2 = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:address2::content\"]"));
		System.out.println("Address - line 2");
		Address2.sendKeys("Syed Jaffer Street");
		
//		City
		
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:city::content\"]"));
		System.out.println("City");
		city.sendKeys("Chennai");
		
//		State/Province
		
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:state::content\"]"));
		System.out.println("State");
		state.sendKeys("Tami Nadu");
		
//		ZIP/Postal Code
		
		Thread.sleep(1000);
		WebElement pincode = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:postalCode::content\"]"));
		System.out.println("ZIP/Postal Code");
		pincode.sendKeys("636006");
		
//		Create Account Button
		
		Thread.sleep(3000);
		WebElement Createaccount = driver.findElement(By.xpath("//*[@id=\"sView1:r1:0:b1\"]/a"));
		System.out.println("Create Account Button Clicked");
		Createaccount.click();
		
//		Close the testing page
		
		System.out.println("Close the testing page successfully");
		driver.close();
		
	 }catch(NoSuchElementException e) {
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
	  driver=null;
  }

}
