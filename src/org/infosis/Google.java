package org.infosis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMPL 1\\eclipse-workspace\\SelleniumDay4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	

	WebElement txtSearch=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
	txtSearch.sendKeys("greens velmurugan");
	Thread.sleep(3000);
	WebElement btnClick=driver.findElement(By.xpath("//body[@jsmodel=\"TvHxbe\"]"));
btnClick.click();
	Thread.sleep(3000);
	
	
	}
}
