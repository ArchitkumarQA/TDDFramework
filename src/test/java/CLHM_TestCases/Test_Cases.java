package CLHM_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CLHM_PageObjects.AddCourseDetails;
import CLHM_PageObjects.AssessmentPage;
import CLHM_PageObjects.Base;
import CLHM_PageObjects.InstResourceCenter;
import CLHM_PageObjects.LPNpage;
import CLHM_PageObjects.LoginPage;
import CLHM_PageObjects.courseDetailsConfirmation;
import CLHM_PageObjects.courseInfo;
import CLHM_PageObjects.studentActivityPage;
import CLHM_PageObjects.studentLPNPage;
import CLHM_PageObjects.studentPage;
import CLHM_PageObjects.studentQA;

public class Test_Cases {

	LoginPage obj1 = new LoginPage();
	InstResourceCenter obj3 = new InstResourceCenter();
	courseDetailsConfirmation obj4 = new courseDetailsConfirmation();
	AddCourseDetails obj5 = new AddCourseDetails();
	courseInfo obj6 = new courseInfo();
	LPNpage obj7 = new LPNpage();
	studentPage obj9 = new studentPage();
	AssessmentPage obj11 = new AssessmentPage();
	studentQA obj12 = new studentQA();
	studentLPNPage obj13 = new studentLPNPage();
	studentActivityPage obj14 = new studentActivityPage();

	@BeforeClass()
	public void startup() {
		Base obj2 = new Base();
		obj2.setUp();
	}

	@Test(priority = 1)
	public void verify_loginPage1() {

		Assert.assertEquals(obj1.verify_loginPage(), "Cengage Sign In");
	}

	@Test(priority = 2)
	public void inst_Login() throws InterruptedException {

		obj1.set_inst_details_for_login();

		Assert.assertEquals(obj3.verifyIRC(), "Instructor Resource Center");

	}

	@Test(priority = 3)
	public void selectBook() {
		obj3.select_ISBN();
		Assert.assertEquals(obj4.confirm_course_Details(), "Instructor SSO - Create Course Option");
	}

	@Test(priority = 4)
	public void confirmcoursedeatils() {
		obj4.confirmCourseDetails();
	}

	@Test(priority = 5)
	public void courseDetailsConfirmations() {
		
		Assert.assertEquals(obj5.validate_pagetitle(), "Instructor SSO - Create / Edit Course");
		obj5.set_Coursedetails();
		Assert.assertEquals(obj5.validate_courseCreated(), "Course Created");

	}

	@Test(priority = 6)
	public void copyDetails() throws InterruptedException {
		obj6.copy_course_Linkurl();
		obj6.copy_course_created_url();
		obj6.changewindowhandle();
		Assert.assertEquals(obj6.getcoursetitle(), "MindTap - Cengage Learning");
		
	}

	@Test(priority = 7)
	public void closepopups() throws InterruptedException {
		obj7.close_Popup1();
		obj7.close_Popup2();
		obj7.close_Popup3();
		Assert.assertEquals(obj7.validate_ifPopup_closed(), "Add / Create");
		obj7.add_activity();
	}

	@Test(priority = 8)
	public void addactivity() throws InterruptedException {
		obj11.select_Activity_and_Publish();
	}

//	@Test(priority = 9)
//	public void setregionCookies() throws InterruptedException {
//		Assert.assertEquals(obj7.validate_cookiepage(), "Cookie Details");
//		obj7.set_region_cookie();
	//}

	@Test(priority = 10)
	public void student_flow() throws InterruptedException {
		
		obj9.launch_studentCourse();
		obj9.verify_if_student_onLoginPage();
		Assert.assertEquals(obj9.verify_if_student_onLoginPage(), "SIGN IN");
		obj9.add_student_details();
	}

	@Test(priority = 11)
	public void openCourse() throws InterruptedException {
		obj12.check_endTour();
		obj12.refresh_getcurrenturl_selectCourse();
	}

	@Test(priority = 12)
	public void stuLPNPage() throws InterruptedException {
		obj13.close_Popup1();
		obj13.close_Popup2();
		obj13.close_Popup3();
		obj13.select_assigned_activity();

	}
	
	@Test(priority = 13)
	public void attemptActivity() throws InterruptedException
	{
		obj14.Attempt_questions_and_submit();
		obj14.activity_attempted();
		System.out.println("Activity attempted successfully");
		Assert.assertEquals(true, obj14.activity_attempted());
	}
	

}
