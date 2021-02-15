package org.selenium.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowHandlerExample extends BaseClass {

	public static void main(String[] args) {

		/*
		 * This method usd to handle multiple windows
		 */

		loadBrowser();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();

		String MainWindow = driver.getWindowHandle();

		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> it = childwindow.iterator();
		while (it.hasNext()) {
			String childwindowvalue = it.next();
			if (!MainWindow.equalsIgnoreCase(childwindowvalue)) {
				driver.switchTo().window(childwindowvalue);
				WebElement txt = driver.findElement(By.id("sampleHeading"));
				System.out.println("Child window text: " + txt.getText());
				driver.close();
				System.out.println("Child window is closed");
			}
		}
		// No such window execption because control still is in the child window
		// need to get control from child window to parent window
		driver.switchTo().window(MainWindow);
		driver.quit();
	}
}
