package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chromedriver {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");*/
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
