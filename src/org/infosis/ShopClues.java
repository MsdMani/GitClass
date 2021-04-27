package org.infosis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMPL 1\\eclipse-workspace\\SelleniumDay4\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.shopclues.com/");
		driver.manage().window().maximize();
		WebElement txtSearch=driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		txtSearch.sendKeys("vivo mobile");
		Thread.sleep(2000);
		WebElement btnClick=driver.findElement(By.xpath("//div[@class=\"srch_sugg_lst\"]"));
		btnClick.click();
		Thread.sleep(2000);
		WebElement btnClick1=driver.findElement(By.xpath("//img[@data-img=\"https://cdn.shopclues.com/images1/thumbnails/108093/200/200/150185379-108093010-1592898487.jpg\"]"));
		btnClick1.click();
		Thread.sleep(2000);
		
	}
}
