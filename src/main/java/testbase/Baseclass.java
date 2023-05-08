package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GoogleSearchPage;

public class Baseclass {
	public static WebDriver driver;
	public Baseclass(){
this.parametr();
		
	}
	public void parametr(){
		
//		   WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  	
	}
	public void webaddress(String url)
	{
		driver.get(url);
	}

}