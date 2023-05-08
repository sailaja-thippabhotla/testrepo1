package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testbase.Baseclass;

public class GoogleSearchPage extends Baseclass {
//	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
//		super();
//		this.driver = driver;
	}

	public GoogleSearchPage() {
		super();
//		this.driver=driver;
	}

	By searchbox = By.id("APjFqb");
    By searchbtn = By.xpath("//input[@name='btnK']");
	By adactinlink = By.xpath("//a/h3[text()='Adactin.com - Hotel Reservation System']");

	public void searchgoogle(String searchinput) {
		driver.findElement(searchbox).sendKeys(searchinput);
		driver.findElement(searchbtn).click();
      	driver.findElement(adactinlink).click();
	}

}