package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.Baseclass;

public class SearchHotel extends Baseclass {
WebDriver driver;
public SearchHotel(WebDriver driver)
{
	this.driver = driver;
}
By location = By.name("location");
By hotel =  By.name("hotels");
By room = By.name("room_type");
By room_nos = By.id("room_nos");
By datepick_in = By.id("datepick_in");
By datepick_out = By.id("datepick_out");
By adult_room = By.id("adult_room");
By child_room = By.id("child_room");
By Submit = By.id("Submit");

public By getLocation(String value) {
	WebElement findElement2 = driver.findElement(location);
	Select sel = new Select(findElement2);
	sel.selectByValue(value);
	
	return location;
}

public By getHotel(String value1) {
	WebElement findElement3 = driver.findElement(hotel);
	Select sel2 = new Select(findElement3);
	sel2.selectByValue(value1);
	return hotel;
}

public By getRoom(String value2) {
	WebElement findElement4 = driver.findElement(room);
	Select sel3 = new Select(findElement4);
	sel3.selectByValue(value2);
	return room;
}

public By getRoom_nos(int num1) {
	WebElement findElement5 = driver.findElement(room_nos);
	Select sel4 = new Select(findElement5);
	sel4.selectByIndex(num1);
	return room_nos;
}

public By getDatepick_in(String datepickin) {
	WebElement findElement6 = driver.findElement(datepick_in);
	findElement6.clear();
	findElement6.sendKeys(datepickin);
	return datepick_in;
}

public By getDatepick_out(String datepickout) {
	 WebElement findElement7 = driver.findElement(datepick_out);
	    findElement7.clear();
	    findElement7.sendKeys(datepickout);
	return datepick_out;
}

public By getAdult_room(int adultroom ) {
	   WebElement findElement8 = driver.findElement(adult_room);
	    Select sel5 =new Select(findElement8);
	    sel5.selectByIndex(adultroom);
	return adult_room;
}

public By getChild_room(int childroom) {
	 WebElement findElement9 = driver.findElement(child_room);
	    Select sel6 = new Select(findElement9);
	    sel6.selectByIndex(childroom);
	    driver.findElement(Submit).click();
	return child_room;
}
}

//public By getSubmit() {
//    driver.findElement(Submit).click();
//	return Submit;
//}
//
//}
