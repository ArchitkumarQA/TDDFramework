package CLHM_PageObjects;

import org.openqa.selenium.By;

public class studentLPNPage extends Base {
	
	By closePopup2 = By.xpath("//button[@class='close']");
	By closePopup3 = By.className("css-1w5arjy");
	By assignTF = By.xpath("//span[contains(text(),'CLHW Example True/False')]");
	public void close_Popup1() throws InterruptedException

	{
		Thread.sleep(20000);
		try {
			waitExplicitlyCssPath(".QSIPopOver.SI_9QNZajiSCtJ5X1j_PopOverContainer > div:nth-child(2)").click();
			// driver.findElement(By.cssSelector("img[src*='bwc_close.png']")).click();
			System.out.println("Feedback pop-up found");
		} catch (Exception e) {
			System.out.println("Feedback pop-up not found");
		}
	}

	public void close_Popup2() throws InterruptedException {
		driver.findElement(closePopup2).click();
		Thread.sleep(2000);
	}

	public void close_Popup3() throws InterruptedException {
		driver.findElement(closePopup3).click();
		Thread.sleep(2000);
	}

	public void select_assigned_activity() {
		driver.findElement(assignTF).click();
	}

}
