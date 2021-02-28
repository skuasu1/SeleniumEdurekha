package org.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHowerPractise extends BaseClass {

	public static void main(String[] args) {

		loadBrowser();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		driver.get("https://simpleprogrammer.com/discover-my-passion/");
		driver.manage().window().maximize();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement target = driver.findElement(By.xpath("//div[@id='footer']//child::li[1]"));
		actions.moveToElement(target).perform();
		
		String titleLabel = target.getAttribute("title");
		System.out.println(titleLabel);

	}

}