package TestPkg;

import org.testng.annotations.Test;

import Basepkg.baseClass;
import Pagepkg.buyFromMainPage;

public class buyItemFromMainTest extends baseClass{
	@Test
	public void buy() {
		buyFromMainPage ob= new buyFromMainPage(driver);
		ob.buyItem();
	}

}
