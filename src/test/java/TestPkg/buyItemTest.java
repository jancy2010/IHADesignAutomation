package TestPkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Basepkg.baseClass;
import Pagepkg.buyItemPage;


public class buyItemTest extends baseClass {
	
	@Test
	public void buyItem() {
		buyItemPage bt= new buyItemPage(driver);
		bt.exploreEnable();
		bt.checkoutcart();
	}
}
