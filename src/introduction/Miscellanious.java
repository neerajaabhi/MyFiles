package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miscellanious {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/ref=nav_logo/163-6175982-7146464");
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		WebDriverWait wd = new WebDriverWait(driver,5);
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='issDiv4']")));
		driver.findElement(By.xpath(".//*[@id='issDiv3']")).click();
		
		/*int number=findFramenumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		int number1=findFramenumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();*/
		

	}
}
	
	/*public static int findFramenumber(WebDriver driver, By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			if(count>0)
			{
				break;
			}
			else
			{
				System.out.println("Continue Loop");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

}*/
