package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws Throwable {
		Base b=new Base();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siranjeeve\\eclipse-workspace\\JDBC\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/");
	WebElement scroll = driver.findElement(By.xpath("//img[@class='ngg-singlepic ngg-left alignnone']"));
b.scroll(driver, false, scroll);
	}

}
