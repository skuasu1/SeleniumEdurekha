package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FormAutomation extends BaseClass {

	public static void main(String[] args) {

		loadBrowser();

		driver.get("https://demoqa.com/automation-practice-form");
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Karthik");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("S");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("karthiks_27@outlook.com");
		driver.findElement(By.cssSelector(".custom-control-label")).click();
		driver.findElement(By.cssSelector("#userNumber")).sendKeys("1234567890");
		driver.findElement(By.id("dateOfBirthInput")).click();

		WebElement yearDropDown = driver.findElement(By.className("react-datepicker__year-select"));
		Select select = new Select(yearDropDown);
		select.selectByValue("1991");

		// react-datepicker__month-select
		WebElement MonthDropDown = driver.findElement(By.className("react-datepicker__month-select"));
		Select selectMonth = new Select(MonthDropDown);
		selectMonth.selectByIndex(9);

		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, October 27th, 1991']")).click();
		WebElement subJect = driver.findElement(By.xpath(
				"//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		subJect.click();

		// check box element
		WebElement sportsElement = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement readingElement = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement musicElement = driver.findElement(By.id("hobbies-checkbox-3"));

		// to click all the check box for the vlaues
		actions.moveToElement(sportsElement).click().perform();
		actions.moveToElement(readingElement).click().perform();
		actions.moveToElement(musicElement).click().perform();

		// to upload file

		WebElement fileUpload = driver.findElement(By.id("uploadPicture"));
		fileUpload.sendKeys("C:/Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");
		String addresstext = "Karthika Jytothi 3rd link mess road 7th cross vidhyanaagr tumkur";

		driver.findElement(By.id("currentAddress")).sendKeys(addresstext);

		driver.findElement(By.id("state")).click();
		driver.findElement(By.xpath("//div[@class]//child::div[@class=' css-1uccc91-singleValue']")).click();
		String lst = driver.findElement(By.id("city")).getText();
		System.out.println(lst);

	}

}
