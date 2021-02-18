package org.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseClass {

	public static void main(String[] args) {
		loadBrowser();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select selectRef = new Select(driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));
		List<WebElement> list = selectRef.getOptions();
		for (int i = 0; i < list.size(); i++) {
			// to get the values of the dropdown
			System.out.println(list.get(i).getText());
		}
		driver.close();
	}
}
