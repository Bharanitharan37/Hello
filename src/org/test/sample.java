package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\JavaScript\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//newDatatype ref=(newDatatype)var
		//downCasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement txtemail = driver.findElement(By.id("email"));
		//replacement for sendKeys
		js.executeScript("arguments[0].setAttribute('value','selenium')", txtemail);
		//webelement.getattribute value
		Object o = js.executeScript("return arguments[0].getAttribute('value')", txtemail);
		String s=(String)o;
		System.out.println(s);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value','java')", txtpass);
		
		//to print the pass
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", txtpass);
		String s1=(String)o1;
		System.out.println(s1);
		
		//to click login button
		WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click", btnlogin);
	}

}
