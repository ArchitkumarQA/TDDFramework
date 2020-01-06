package CLHM_PageObjects;

import org.openqa.selenium.By;

public class courseDetailsConfirmation extends Base {
	
	By createNewCourse = By.xpath("//input[@id='createNewCourse']");
	By Continue = By.linkText("Continue");

	public String confirm_course_Details()
	{
		String s3= driver.getTitle();
		System.out.println(s3);
		return s3;
	}
	
	public void confirmCourseDetails()
	{
		driver.findElement(createNewCourse).click();
		driver.findElement(Continue).click();
	}
}
