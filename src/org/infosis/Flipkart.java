package org.infosis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMPL 1\\eclipse-workspace\\SelleniumDay4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement txtSearch=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		txtSearch.sendKeys("vivo mobile");
		Thread.sleep(3000);
		WebElement btnClick=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		btnClick.click();	
		WebElement btnClick1=driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));
		btnClick1.click();																																																																																																																																																																																																																													btnClick1.click();
		Thread.sleep(2000);
        WebElement btnClick11=driver.findElement(By.xpath("//span[@class=\"B_NuCI\"]"));
         btnClick11.click();																																																																																																																																																																																																																													btnClick11.click();
         Thread.sleep(2000);
	}
}