package org.selenium.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandlerExample extends BaseClass {

	public static void main(String[] args) {

		/*
		 * This method is used to handle multiple windows
		 */

		loadBrowser();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> childwindowSet = driver.getWindowHandles();
		// to iterate through all the child windows
		Iterator<String> it = childwindowSet.iterator();
		while (it.hasNext()) {
			String childwindowValue = it.next();
			if (!parentWindow.equalsIgnoreCase(childwindowValue)) {
				driver.switchTo().window(childwindowValue);
				String text = driver.findElement(By.xpath("//h1[normalize-space()='This is a sample page']")).getText();
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).click();
		driver.manage().window().maximize();
		driver.close();
	}
}
