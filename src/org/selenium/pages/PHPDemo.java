package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PHPDemo extends BaseClass{

	public static void main(String[] args) {
		
		load();
		driver.get("https://phptravels.com/");
		String title = driver.getTitle();
		WebElement titleShown = driver.findElement(By.xpath("//*[name()='text' and @id='PHPTRAVELS']"));
		if(title.equals(titleShown)) {
			System.out.println("Title is good");
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Demo']")).click();
		driver.findElement(By.xpath("//small[normalize-space()='http://www.phptravels.net']")).click();
		driver.close();
	}
}
