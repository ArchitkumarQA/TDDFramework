package CLHM_PageObjects;

import org.openqa.selenium.By;

public class studentQA extends Base {
	
	By endtourClose = By.cssSelector(".jr_left_buttons");
	By createdCourse = By.xpath("//div[contains(text(),'Courses')]");
	By finalCourse = By.xpath("//div[contains(text(),'xyz')]");
	
	//div[contains(text(),'"AddCourseDetails.coursename"')]
	public void check_endTour() throws InterruptedException
	{
		Thread.sleep(10000);
		try {
			if(waitExplicitlyXPath("//a[contains(text(),'End Tour')]").isDisplayed()) {
			driver.findElement(endtourClose).click();
			System.out.println("Endtour flow");

		}
		}

		catch (Exception e) {
			System.out.println("normal flow");
		}
	}

	public void refresh_getcurrenturl_selectCourse() throws InterruptedException
	{
		Thread.sleep(7000);
//		   driver.navigate().refresh();
//		   driver.get(driver.getCurrentUrl());
		 
		driver.findElement(createdCourse).click();
		Thread.sleep(2000);
		
		finalCourse = By.xpath("//div[contains(text(),'"+AddCourseDetails.coursename+"')]");
		System.out.println(finalCourse);
		driver.findElement(finalCourse).click();
	}
	
	
}
