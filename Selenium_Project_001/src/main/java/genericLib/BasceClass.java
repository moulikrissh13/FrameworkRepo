package genericLib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasceClass {

	
	@BeforeClass
	public void openBrowserTest() {
		System.out.println("Browser Opened");
	}
	
	@AfterClass
	public void closewBrowserTest() {
		System.out.println("Browser Closed");
	}
	
	@BeforeMethod
	public void logInTest() {
		System.out.println("Login Successful");
	}
	
	@BeforeClass
	public void logOutTest() {
		System.out.println("Logout Successful");
	}
}
