package org.infosis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMPL 1\\eclipse-workspace\\SelleniumDay4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUser=driver.findElement(By.xpath("//input[@name='email']"));
		txtUser.sendKeys("msdmani");
		String userName=txtUser.getAttribute("value");
		System.out.println(userName);
		WebElement txtPass=driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("965679997");
		String userPassword=txtPass.getAttribute("value");
		System.out.println(userPassword);
	}

}
