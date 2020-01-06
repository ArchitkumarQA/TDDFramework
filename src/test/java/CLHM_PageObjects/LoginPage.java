package CLHM_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import CLHM_TestCases.Test_Cases;

public class LoginPage extends Base {
	
	

	By inst_username = By.id("emailId");
	By inst_password = By.id("password");
	By sign_Button = By.xpath("//button[@class='btn btn-primary']");

	public String verify_loginPage() {
		driver.get(DataValues.stage);
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public void set_inst_details_for_login() throws InterruptedException {

		driver.findElement(inst_username).sendKeys(DataValues.Stageinstusername);
		driver.findElement(inst_password).sendKeys(DataValues.Stageinstpassword);
		driver.findElement(sign_Button).click();
		
	}
}
