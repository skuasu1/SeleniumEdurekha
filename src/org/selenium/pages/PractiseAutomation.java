package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PractiseAutomation extends BaseClass {

	public static void main(String[] args) {
		boolean flag;
		loadBrowser();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		// locating elements using id
		flag = driver.findElement(By.name("firstname")).isEnabled();
		if (flag) {
			driver.findElement(By.name("firstname")).sendKeys("karthik");
		}
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Subramanya");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.cssSelector("input[id='exp-5']")).click();
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.xpath("//input[@id='tool-0']")).click();
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		Select country = new Select(driver.findElement(By.className("input-xlarge")));
		country.selectByVisibleText("Australia");
		Select selcommands = new Select(driver.findElement(By.id("selenium_commands")));
		selcommands.selectByVisibleText("Browser Commands");
		selcommands.selectByVisibleText("Wait Commands");
		driver.close();
	}
}
