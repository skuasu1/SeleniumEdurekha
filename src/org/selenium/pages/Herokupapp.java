package org.selenium.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Herokupapp {

	public static void main(String[] args) throws IOException, InterruptedException {
		// we can overrdie te implicit wait for the HTML element

		// Invoking browser here browser used is Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Java Coding\\Chrome Driver\\chromePath\\chromedriver.exe");

		// to disable all chrome notifications

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/frames']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='iFrame']")).click();

		

	}

	
	/*
	 * This common method is used to take the screen shot of the current view page
	 * of the element
	 */

	public static void ScreenShot(WebDriver driver) throws IOException {
		// typecasting my driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		// need to get the source and getscreenshotas is the one ttakes the screen shot
		// in webdriver
		File source = ts.getScreenshotAs(OutputType.FILE);
		// COPY THE SOURCE FILE TO THE CURRENT LOCATION DESTINATION
		FileUtils.copyFile(source, new File(".\\screenshot\\facebook.png"));

	}

}
