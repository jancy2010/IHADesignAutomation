package TestPkg;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Basepkg.baseClass;
import Pagepkg.search1Page;

public class search1Test extends baseClass {
@Test
public void seacrching() {
	search1Page ob= new search1Page(driver);
	ob.firstsearch();
}
}
