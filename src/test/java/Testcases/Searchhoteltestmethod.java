package Testcases;

import org.junit.Before;
import org.junit.Test;

import objects.GoogleSearchPage;
import objects.Loginpage;
import objects.SearchHotel;
import testbase.Baseclass;

public class Searchhoteltestmethod extends Baseclass {
	SearchHotel searchhotel;
	Loginpage loginpage;
	GoogleSearchPage googleSearchPage;
	public Searchhoteltestmethod() {
	super();
	}
	@Before
	public void beforesearch()
	{
        GoogleSearchPage page = new GoogleSearchPage(driver);
	webaddress("https://www.google.com/");
	page.searchgoogle("adactinhotelapp");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.usrnam("sailajath");
		loginpage.pswd("password");
		
	}
	
	@Test
public void searchhotelvals() {
SearchHotel sh = new SearchHotel(driver);
sh.getLocation("Adelaide");
sh.getHotel("Hotel Sunshine");
sh.getRoom("Double");
sh.getRoom_nos(2);
sh.getDatepick_in("20/04/2023");
sh.getDatepick_out("24/04/2023");
sh.getAdult_room(2);
sh.getChild_room(2);

}
}
