package org.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHowerExample extends BaseClass {
	
	public static WebElement mainitem2,subsublist,subsublistitem1;

	public static void main(String[] args) {

		loadBrowser();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);// instantiating action object
		
		mainitem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		actions.moveToElement(mainitem2).perform();
		
		subsublist = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		actions.moveToElement(subsublist).perform();
		
		
		subsublistitem1 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		actions.moveToElement(subsublistitem1).click();
		
		
		
		//WebElement dropDownSubList2 =driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")); 
		//dropDownSubList2.click();

	}
}
