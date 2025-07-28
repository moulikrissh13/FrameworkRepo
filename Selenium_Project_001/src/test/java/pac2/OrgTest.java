package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {
		
		String value = System.getProperty("browser","CHROME");
		
		System.out.println(value);
		
		System.out.println("Executed createOrgTest()");
	}
	
	
	@Test
	public void modifiedOrgTest() {
		
		System.out.println("Executed modifiedOrgTest()");
		System.out.println("Executed Regression Suite");
	}
}
