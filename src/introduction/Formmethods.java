package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Formmethods {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Before clicking the multi city");
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		System.out.println("After clicking the multi city");
		driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());

		/*int count = driver.findElements(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).size();
		if(count==0)
		{
			System.out.println("Verified!");
			
			
		}
		System.out.println(driver.findElement(By.xpath(".//*[@id='hp-banner']/div[1]/div/div[6]/div/section/h4/b")).getText());*/
		
		/*driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.cssSelector("[fare-date='1490846400000']")).click();
		
		driver.findElement(By.xpath(".//*[@id='hp-widget__paxCounter']")).click();
		driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[8]")).click();
		/*int i=0;
		while(i<5)
		{
			driver.findElement(By.xpath(""))
		}*/
	}

}
