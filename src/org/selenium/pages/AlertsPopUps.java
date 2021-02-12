package org.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsPopUps {

	public static void main(String[] args) {

		// Invoking browser here browser used is Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Java Coding\\Chrome Driver\\chromePath\\chromedriver.exe");

		// to disable all chrome notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println("Alert text is " + alertText);
		promptAlert.accept();

	}

}
