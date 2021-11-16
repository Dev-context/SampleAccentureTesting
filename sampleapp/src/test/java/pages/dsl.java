package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dsl {

	private WebDriver driver;

	public dsl(WebDriver driver) {
		this.driver = driver;
	}

	public void write(By By, String text) {
		driver.findElement(By).sendKeys(text);
	}

	public void click(By By) {
		driver.findElement(By).click();
	}

	public boolean selectOption(By By, String option) {
		boolean find = false;
		ArrayList<WebElement> select = (ArrayList<WebElement>) driver.findElement(By)
				.findElements(By.tagName("option"));
		for (int i = 0; i < select.size(); i++) {

			if (select.get(i).getText().equalsIgnoreCase(option)) {
				select.get(i).click();
				find = true;

			}

		}
		return find;
	}
	
	

}
