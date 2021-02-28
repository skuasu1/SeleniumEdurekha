package org.selenium.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowHandlerExampleNew extends BaseClass{

	public static void main(String[] args) {
		loadBrowser();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		
		// another way to get child window handles
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("***********Current Parent window value**************");
		System.out.println("Current Parent window value is:" + (driver.getWindowHandle()));
		System.out.println("Current Parent window tite" + driver.getTitle());
		System.out.println("List of all windows : "+tabs);
		System.out.println("***************Switching to child window************");
		driver.switchTo().window(tabs.get(1));
		System.out.println("Current window control is" +driver.getWindowHandle());
		String childwindowTitle = driver.findElement(By.xpath("//h1[normalize-space()='This is a sample page']")).getText();
		System.out.println(childwindowTitle);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("Control of current parent window" + driver.getWindowHandle());
		System.out.println("Current Parent window title :" +driver.getTitle());
		driver.close();
		System.out.println("************Parent window closed*****");

	}

}
