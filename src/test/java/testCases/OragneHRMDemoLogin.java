package testCases;

import org.testng.annotations.Test;

import testMethodImplementations.LoginImplementation;

public class OragneHRMDemoLogin extends LoginImplementation{

	
	@Test
	public void LoginToOrangeHRMDemo() throws Throwable {
		Login();
        String actualTitle = driver.getTitle();
	}
}
