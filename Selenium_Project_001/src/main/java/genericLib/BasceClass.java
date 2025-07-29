package genericLib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasceClass {

	
	@BeforeClass
	public void openBrowserTest() {
		
		/*below line for receive data from command line, if forgot try to capture from test script*/
		
		String browser = System.getProperty("browser","chrome");
		
		System.out.println("Browser Opened"+browser);
	}
	
	@AfterClass
	public void closewBrowserTest() {
		
		/*below 2 lines for receive data from command line, if not try to capture from test script*/
		
		String username = System.getProperty("username","moulikrissh13");
		
		String password = System.getProperty("password","12345678");
		
		System.out.println("Browser Closed"+username);
		
		System.out.println("Browser Closed"+password);
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
