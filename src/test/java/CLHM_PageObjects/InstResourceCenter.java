package CLHM_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class InstResourceCenter extends Base {

	By selectISBN = By.xpath("//select[@id='productISBN']");

	By createCourse = By.cssSelector(".fa.fa-plus");

	By instResCent = By.xpath("//h2[contains(text(),'Instructor Resource Center')]");

	public void select_ISBN() {

		Select select = new Select(driver.findElement(selectISBN));
		select.selectByValue("9781133314677");
		// Click create course
		driver.findElement(createCourse).click();

	}

	public String verifyIRC() {
		String s2 = driver.findElement(instResCent).getText();
		return s2;

	}

}
