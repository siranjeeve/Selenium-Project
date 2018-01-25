package testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	public void scroll(WebDriver driv,Boolean b,WebElement ele) {
		
JavascriptExecutor j=(JavascriptExecutor)driv;
j.executeScript("arguments[0].scrollIntoView("+b+");",ele);

	}

}
