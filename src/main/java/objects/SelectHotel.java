package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Baseclass;

public class SelectHotel extends Baseclass {

   WebDriver driver;

	public SelectHotel(WebDriver driver)
	{
		this.driver= driver;
	}
	By radiobutton_0 = By.id("radiobutton_0");
	By continueid = By.id("continue");

	
	public By getRadiobutton_0() {
		WebElement findElement10 = driver.findElement(radiobutton_0);
	    findElement10.click();
		return radiobutton_0;
	}
	public By getContinueid() {
		WebElement findElement11 = driver.findElement(continueid);
	    findElement11.click();
		return continueid;
	}
	
}
