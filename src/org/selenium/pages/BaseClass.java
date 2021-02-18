package org.selenium.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void loadBrowser() {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\drivers\\chromedriver02.exe");
		driver = new ChromeDriver();
	}

	public static void Screenshot(WebDriver driver) {

		TakesScreenshot sc = (TakesScreenshot) driver;
		File sourceFile = sc.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("./snapshot/skuasu.png"));
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
