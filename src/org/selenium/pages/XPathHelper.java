package org.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathHelper {
	public static WebDriver driver;

	public static void main(String[] args) {
		String currentdirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:\\Java Coding\\Chrome Driver\\chromePath\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#identifierId")).click();
		//driver.findElement(By.xpath("//*[@id=\"content\"]//ul//li[22]/a")).click();
		

	}

}
