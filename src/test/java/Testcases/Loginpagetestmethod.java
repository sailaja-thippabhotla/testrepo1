package Testcases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import objects.GoogleSearchPage;
import objects.Loginpage;
import testbase.Baseclass;

public class Loginpagetestmethod extends Baseclass {
	Loginpage loginpage;
	GoogleSearchPage googleSearchPage;
	public Loginpagetestmethod()
	{
//		super();
	}
	@Test
	public void setup()
	{
		
//		parametr();
        GoogleSearchPage page = new GoogleSearchPage(driver);
	webaddress("https://www.google.com/");
	page.searchgoogle("adactinhotelapp");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.usrnam("sailajath");
		loginpage.pswd("password");
		
//		page.searchgoogle("adactinhotelapp"); 
	}
	
	
}
