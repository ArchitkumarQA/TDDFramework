package CLHM_PageObjects;

import org.openqa.selenium.By;

public class studentPage extends courseInfo {
	
	By stu_email = By.cssSelector("#email");
	By stu_pass = By.cssSelector("#password");
	By signin = By.cssSelector(".btn.btn-secondary.pill");
	

	
	public void launch_studentCourse()
	{
		
			driver.get(courseInfo.courseUrl);
		
	}
public String verify_if_student_onLoginPage()
	
	{
		String s4 =driver.findElement(signin).getText();
		System.out.println(s4);
		return s4;
	}

	public void add_student_details() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(stu_email).sendKeys(DataValues.Stagestuusername);
		driver.findElement(stu_pass).sendKeys(DataValues.Stagestupassword);
		driver.findElement(signin).click();
		Thread.sleep(5000);
		
	}
	
	
	

}
