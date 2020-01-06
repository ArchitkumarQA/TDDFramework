package CLHM_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LPNpage extends Base {
	
	By popup2 = By.xpath("//button[@class='close']");
	By popup3 = By.className("css-1w5arjy");
	By dropdown = By.cssSelector("#AddDropdown");
	By add = By.cssSelector("a[aria-label='Add/Create an activity']");
	By cookieDetails = By.xpath("//h1[contains(text(),'Cookie Details')]");
	By regioncode = By.id("regionCode");
	By medGreenButton = By.className("medium_green_button");
	
	
	
	public void close_Popup1()
	{
		try {
			waitExplicitlyCssPath(".QSIPopOver.SI_3K9j9v78itjMYyp_PopOverContainer > div:nth-child(2)").click();
			// driver.findElement(By.cssSelector("img[src*='bwc_close.png']")).click();
			System.out.println("Feedback pop-up found");
		} catch (Exception e) {
			System.out.println("Feedback pop-up not found");
		}
	}
	
	public void close_Popup2()
	{
		driver.findElement(popup2).click();
		
	}
	
	public void close_Popup3()
	{
		driver.findElement(popup3).click();
		
	}
	
	public String validate_ifPopup_closed()
	{
		String s6= driver.findElement(dropdown).getText();
		System.out.println(s6);
		return(s6);
	}
	
	public void add_activity() throws InterruptedException
	{
		driver.findElement(dropdown).click();
		driver.findElement(add).click();
		waitExplicitlyXPath("//span[text()='Assessment']").click();
		
	}
	

	public String validate_cookiepage()
	{
		driver.get("https://s-c-login.cengagebrain.com/cb/regionCookie.htm");
		String s5= driver.findElement(cookieDetails).getText();
		return s5;
	}
	
	public void set_region_cookie() throws InterruptedException
	{
		
		Select select2 = new Select(driver.findElement(regioncode));
		select2.selectByValue("USA");
		driver.findElement(medGreenButton).click();
		Thread.sleep(5000);
	}
	
	
}

