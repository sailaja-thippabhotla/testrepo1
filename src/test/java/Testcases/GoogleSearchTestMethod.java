package Testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import objects.GoogleSearchPage;
import testbase.Baseclass;

public class GoogleSearchTestMethod extends Baseclass {
	GoogleSearchPage page;

	public GoogleSearchTestMethod() {

	}

//	WebDriver driver;

	@Test

	public void searchoperation() {
//		parametr();

		
		GoogleSearchPage googleSearchPage = new GoogleSearchPage();
		webaddress("https://www.google.com/");
		googleSearchPage.searchgoogle("adactinhotelapp");

	}

//	@Test
//	public void searchadac() {
//
//		GoogleSearchPage googleSearchPage = new GoogleSearchPage();
//		googleSearchPage.searchgoogle("adactinhotelapp");
//	}

}
