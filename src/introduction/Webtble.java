package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtble {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
		WebElement table = driver.findElement(By.xpath(".//table[@class='batting-table innings']"));
		List<WebElement>noofrows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows"+noofrows.size());
		int i=0;
		for(WebElement eachrow:noofrows)
		{
			List<WebElement>eachcolumn=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("No of columns in"+i+"th row is"+eachcolumn.size());
			for(WebElement text:eachcolumn)
			{
				System.out.println(text.getText());
			}
		}

	}

}
