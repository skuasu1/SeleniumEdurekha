package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteExample extends BaseClass {

	public static void main(String[] args) {

		loadBrowser();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// vertical scrolling d
		js.executeScript("window.scrollBy(0,200)");

		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Karthik S");
		driver.findElement(By.id("userEmail")).sendKeys("karthiks_27@outlook.com");
		driver.findElement(By.id("currentAddress"))
				.sendKeys("mathrushree Village homes" + "Yemalur main road, yemalur Bangalore 560037");

		Actions actions = new Actions(driver);

		// ctrl+A
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();

		// ctrl+c
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();

		// switch tab
		actions.sendKeys(Keys.TAB);
		actions.build().perform();

		// ctrl+V
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		driver.manage().window().maximize();
		driver.close();
	}
}
