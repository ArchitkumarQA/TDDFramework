package CLHM_PageObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class courseInfo extends Base {

	public static String courseUrl;
	public static String instUrl;
	
	By courseurl = By.cssSelector(".distributionOptions>a:nth-child(2)");
	By insturl =  By.cssSelector(".stepContent>a[target='_blank']");

	public void copy_course_Linkurl() {
		courseUrl = driver.findElement(courseurl).getAttribute("href");
		System.out.println(courseUrl);
	}

	public void copy_course_created_url() {
		instUrl = driver.findElement(insturl).getAttribute("href");
		driver.findElement(insturl).click();

	}
	public String getcoursetitle()
	{
		String s5 = driver.getTitle();
		System.out.println(s5);
		return s5;
	}
	
	public void changewindowhandle() throws InterruptedException
	{
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(20000);
	}
}
