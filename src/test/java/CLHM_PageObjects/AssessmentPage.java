package CLHM_PageObjects;

import org.openqa.selenium.By;

public class AssessmentPage extends Base {
	
	By frameElement = By.xpath("//div[@class='ComponentLoader__container']//iframe");
	By SAButton = By.xpath("//div[text()='Simple Assessment']");
	By ubercoursemode = By.xpath(
			"//span[contains(text(),\"Cengage: ADFs for Uber Coursemode CLHW display of Simple Items, 01e\")]");
	By truefalse = By.xpath("//span[contains(text(),\"CLHW Example True/False\")]");
	By containsText = By.xpath("//button[contains(text(),\"Add\")]");

	public void select_Activity_and_Publish() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(frameElement));
		Thread.sleep(2000);
		driver.findElement(SAButton).click();
		driver.findElement(ubercoursemode).click();
		driver.findElement(truefalse).click();
		Thread.sleep(2000);
		waitExplicitlyCssPath(".publishButton.ng-scope").click();
		// driver.findElement(By.css("publishButton ng-scope")).click();
		driver.findElement(containsText).click();
		Thread.sleep(2000);
		System.out.println("Activity added successfully");
	}
	
		
	
}
