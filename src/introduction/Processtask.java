package introduction;

import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
//import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.sun.jna.platform.FileUtils;

public class Processtask {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		//WindowsUtils.killByName("notepad.exe");
		Set<Cookie>abc=driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println(abcd.size());
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Abhirami\\Downloads\\xyz.png"));
		

	}

}
