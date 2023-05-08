package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testbase.Baseclass;

public class Loginpage extends Baseclass {

	//WebDriver driver;
	public  Loginpage(WebDriver driver) {
    this.driver =driver;

	}
	By usernam = By.id("username");
	By pass = By.id("password");
	By login = By.id("login");
	
 public void usrnam(String username){
	 driver.findElement(usernam).sendKeys(username);
}
 public void pswd(String password)
 {
	 driver.findElement(pass).sendKeys(password);
	 driver.findElement(login).click();
	
 }
 
}

