package testMethodImplementations;


import pageObjects.LoginPage;
import utilities.Utilities;

public class LoginImplementation extends Utilities{
	LoginPage lp;
	
	public void Login() {		
		lp = new LoginPage(driver);
		enterValue(lp.UserName, "Admin");
		enterValue(lp.password, "admin123");
		click(lp.Login);
	}
}
