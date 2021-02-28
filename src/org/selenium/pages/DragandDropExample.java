package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample extends BaseClass {

	public static void main(String[] args) {

		loadBrowser();
		Actions actions = new Actions(driver);
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, destination).perform();

	}

}
