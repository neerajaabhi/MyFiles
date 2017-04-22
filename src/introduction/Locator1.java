package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();*/
		
		driver.get("http://facebook.com");
		driver.findElement(By.tagName("a"));
		
		/*driver.findElement(By.className("inputt
		 * ext")).sendKeys("abhiramineeraja@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abhi");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		
		//driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		
		

	}

}
