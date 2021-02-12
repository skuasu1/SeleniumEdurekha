package org.selenium.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EdurekhaSeleniumAutomation {

	public static void main(String[] args) {
		String emailcolor = null;

		System.setProperty("webdriver.chrome.driver", "D:\\Java Coding\\Chrome Driver\\chromePath\\chromedriver.exe");

		// to disable all chrome notifications

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String bg = driver.findElement(By.name("login")).getCssValue("background-color");
		String value = "rgba(24, 119, 242, 1)";
		System.out.println(bg);
		if (bg.equalsIgnoreCase(value)) {
			driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
			// label[normalize-space()='Email or phone']
			emailcolor = driver.findElement(By.xpath("//label[text()='Email or phone']"))
					.getCssValue("background-color");
			System.out.println(emailcolor);
		}
		String vaue2 = "rgba(0, 0, 0, 0)";
		if (emailcolor.equalsIgnoreCase(vaue2)) {
			if (driver.findElement(By.xpath("//label[@id='loginbutton']")).isEnabled()) {
				boolean URL = driver.getCurrentUrl().substring(0).equalsIgnoreCase(
						"https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
				if (URL) {
					driver.findElement(By.linkText("Forgotten account?")).click();
					driver.findElement(By.cssSelector("input[id=identify_email]")).sendKeys("@!");
					driver.findElement(By.id("did_submit")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[2]/div[1]/div[1]"))
							.getText();
					String header = driver
							.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[1]/div/div[2]/h2"))
							.getText();
					if (header.equalsIgnoreCase("Find Your Account")) {
						driver.close();
					}
				}
			}
		}

	}

}
