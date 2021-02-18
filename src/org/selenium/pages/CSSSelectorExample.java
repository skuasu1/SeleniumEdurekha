package org.selenium.pages;

import org.openqa.selenium.WebDriver;

public class CSSSelectorExample {
	public static WebDriver driver;

	public static void main(String[] args) {
		String currentdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentdirectory + "\\drivers\\chromedriver.exe");
		driver.get("");

	}

}
