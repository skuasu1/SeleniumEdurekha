package org.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class MultipleFrames extends BaseClass {
	public static void main(String[] args) {
		loadBrowser();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		// switching to frame 1 if no framename or frameid
		driver.switchTo().frame(1);
		driver.findElement(By.name("name")).sendKeys("karthik.S");
		js.executeScript("window.scrollBy(0,-250)");// vertical
		driver.findElement(By.name("suggestions")).sendKeys("I am from tumkur");
		js.executeScript("window.scrollBy(0,-250)");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();
		// switch from frame 1 to frame 0 which is default and then to frame 2
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		// get select the parent drop down
		Select select = new Select(driver.findElement(By.name("select1")));
		// get all the options 
		select.selectByVisibleText("PREFORMATTED TEXT");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@href='intro.htm']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
}
