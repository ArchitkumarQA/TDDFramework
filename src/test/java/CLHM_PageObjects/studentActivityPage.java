package CLHM_PageObjects;

import org.openqa.selenium.By;

public class studentActivityPage extends Base {

	By activityframe = By.className("ActivityFrame__iFrame");
	By value2 = By.xpath("//input[@value='2']");
	By valuesubmit = By.xpath("//input[@value='Submit']");
	By nextbutton = By.cssSelector(".next-button");
	By value1 = By.xpath("//input[@value='1']");
	By assessmentInput = By.xpath("//*[@id=\"rhs-part-assessment1_part2\"]/div[2]/input");
	By assessmentbutton = By.xpath("//*[@id=\"rhs-part-assessment1_part2\"]/div[2]/button[2]");
	By finalButton = By.id("rhs-finalsubmit");

	public void Attempt_questions_and_submit() throws InterruptedException {
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(activityframe));
		driver.switchTo().frame("easyXDM_activityService_cxp_Target_provider");
		Thread.sleep(2000);
		driver.findElement(value2).click();
		driver.findElement(valuesubmit).click();
		driver.findElement(nextbutton).click();
		driver.findElement(value1).click();
		driver.findElement(assessmentInput).click();
		Thread.sleep(1000);
		driver.findElement(assessmentbutton).click();
		driver.findElement(finalButton).click();

	}
	public boolean  activity_attempted()
	{
		boolean B =driver.findElement(By.cssSelector(".activity-icon-container done")).isDisplayed();
		return B;
	}
}
