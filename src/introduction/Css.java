package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abhirami");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abhi");
		driver.findElement(By.cssSelector("[id='Login']")).click();

	}

}
