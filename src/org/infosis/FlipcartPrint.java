package org.infosis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartPrint {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMPL 1\\eclipse-workspace\\SelleniumDay4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement btnClick=driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
		btnClick.click();
		
		//WebElement btnClick1=driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
//btnClick1.click();
	Thread.sleep(3000);
		WebElement txtUser=driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]"));
		txtUser.sendKeys("manikandan");
		String userName=txtUser.getAttribute("value");
		System.out.println(userName);
		Thread.sleep(3000);
		WebElement txtPass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	txtPass.sendKeys("67722222");
	String userPassword=txtPass.getAttribute("value");
	System.out.println(userPassword);
	Thread.sleep(3000);
		WebElement btnClick11=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
		btnClick11.click();
	Thread.sleep(2000);
	}

}
