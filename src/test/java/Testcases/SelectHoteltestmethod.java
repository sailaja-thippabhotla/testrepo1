package Testcases;

import org.junit.Before;
import org.junit.Test;

import objects.GoogleSearchPage;
import objects.Loginpage;
import objects.SearchHotel;
import objects.SelectHotel;
import testbase.Baseclass;

public class SelectHoteltestmethod extends Baseclass {
	SelectHotel selecthotel;
	SearchHotel searchhotel;
	Loginpage loginpage;
	GoogleSearchPage googleSearchPage;
	public  SelectHoteltestmethod() {
		super();
	}
     
	@Before
	public void selectbefore()
	{
        GoogleSearchPage page = new GoogleSearchPage(driver);
        
	webaddress("https://www.google.com/");
	page.searchgoogle("adactinhotelapp");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.usrnam("sailajath");
		loginpage.pswd("password");

	}
	@Test
	public void selecthoteltest()
	{
		
	}

}
