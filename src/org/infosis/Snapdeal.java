package org.infosis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMPL 1\\eclipse-workspace\\SelleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement txtSearch=driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
	txtSearch.sendKeys("watch");
	Thread.sleep(3000);
	WebElement btnClick=driver.findElement(By.xpath("//span[@class=\"searchTextSpan\"]"));
	btnClick.click();
	Thread.sleep(2000);
	WebElement btnClick1=driver.findElement(By.xpath("//p[@title=\"ITRACK NA Silicon Analog Men's Watch\"]"));
	btnClick1.click();
	
	
}
}