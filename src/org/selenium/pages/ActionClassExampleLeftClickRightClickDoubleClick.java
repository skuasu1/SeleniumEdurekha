package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExampleLeftClickRightClickDoubleClick extends BaseClass {

	public static void main(String[] args) {
		// action is an interface which provides in built methods to capture mouse
		// actions

		loadBrowser();
		// creating action object of reference actions
		Actions actions = new Actions(driver);
		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
		WebElement RightClickButtin = driver.findElement(By.id("rightClickBtn"));
		
		// to perform right click 
		actions.contextClick(RightClickButtin).perform();
		
		String pText = driver.findElement(By.id("rightClickMessage")).getText();
		
		if (pText.equalsIgnoreCase("You have done a right click")) {
			System.out.println("Right click is done");
		}
		// to perform double click
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		// double click
		actions.doubleClick(doubleClick).perform();
		System.out.println("Double click is done");
		
		
		WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		// single click
		actions.click(singleClick).perform();
		System.out.println("Single click is done");

	}

}
