package CLHM_PageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;

public class AddCourseDetails extends Base {
	
	 public static String coursename ;

	By courseCreated = By.xpath("//h1[contains(text(),'Course Created')]");
	By course_name = By.xpath("//input[@id='courseName']");
	By beginDate = By.xpath("//input[@id='beginDate']");
	By endDate = By.xpath("//input[@id='endDate']");
	By createcoursebutton = By.linkText("Create Course");
	
	
	public String validate_pagetitle()
	{
		String pgTitlte = driver.getTitle();
		return pgTitlte;
	}

	public void set_Coursedetails() {
		
		  coursename = "Test@321#" + System.currentTimeMillis();
		  System.out.println(coursename);
		driver.findElement(course_name).sendKeys(coursename);
		// driver.findElement(By.xpath("//input[@id='calendar1']")).click();
		DateFormat dt = new SimpleDateFormat("M/d/yyyy");
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		driver.findElement(beginDate).sendKeys(dt.format(calendar.getTime()));
		calendar.add(Calendar.DATE, 15);
		date = calendar.getTime();
		driver.findElement(endDate).sendKeys(dt.format(date));
		driver.findElement(createcoursebutton).click();
	}

	public String validate_courseCreated() {
		String s3 = driver.findElement(courseCreated).getText();
		System.out.println( s3);
		return s3;
	}

}
