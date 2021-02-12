package org.selenium.pages;

/*
 * 
 * Handling frames, tabs switch
 */

public class ScreenshotExampe extends BaseClass {

	public static void main(String[] args) {

		load();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		Screenshot(driver);
		driver.close();
	}
}
