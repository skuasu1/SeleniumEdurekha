package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends BaseClass {

	public static void main(String[] args) {
		loadBrowser();
		driver.get("https://www.google.co.in/");
		Actions actions = new Actions(driver);
		WebElement mouseHoverELE = driver
				.findElement(By.xpath("//div[@aria-label='Search by voice']//*[local-name()='svg']"));
		actions.moveToElement(mouseHoverELE).perform();
	}

}
