package org.selenium.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramePractise extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		loadBrowser();
		// to disable all chrome notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("hi this is karthik");
		//driver.quit();

	}

}
