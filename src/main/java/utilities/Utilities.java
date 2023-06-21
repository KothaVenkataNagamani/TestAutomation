package utilities;

import org.openqa.selenium.WebElement;

import baseLibrary.BaseLibrary;

public class Utilities extends BaseLibrary{

	
	public void click(WebElement ele) {
		ele.click();
	}
	
	public void enterValue(WebElement ele, String text) {
		ele.sendKeys(text);
	}
}
