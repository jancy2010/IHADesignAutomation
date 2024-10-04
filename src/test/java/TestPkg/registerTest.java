package TestPkg;

import org.testng.annotations.Test;

import Basepkg.baseClass;
import Pagepkg.registerPage;

public class registerTest extends baseClass {
	@Test
	public void reg() {
		registerPage ob= new registerPage(driver);
		ob.reg();
	}
}
