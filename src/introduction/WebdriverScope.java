package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		//System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		//System.out.println(col.findElements(By.tagName("a")).size());
		String Beforeclicking=null;
		String Afterclicking;
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			Beforeclicking=driver.getTitle();
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
			col.findElements(By.tagName("a")).get(i).click();
			break;
		}
		

	}
		Afterclicking=driver.getTitle();
		if(Beforeclicking!=Afterclicking)
		{
			Thread.sleep(3000);
			if(driver.getPageSource().contains("Sitemap"))
				System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

}
}
