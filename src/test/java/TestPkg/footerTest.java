package TestPkg;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Basepkg.baseClass;
import Pagepkg.footerPage;

public class footerTest extends baseClass {
	@Test
	public void footer(){
		footerPage ob= new footerPage(driver);
		ob.termsLoading();
		driver.navigate().back();
		ob.dtdcLoading();
		driver.navigate().back();
		ob.duppattaLoading();
		driver.navigate().back();
		ob.partyLoading();
		driver.navigate().back();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	       js.executeScript("window.scrollBy(0,350)", "");
//		ob.fbLoading();
//		driver.navigate().back();
//		ob.instaLoading();
//		driver.navigate().back();
//		ob.ytLoading();
//		driver.navigate().back();
//		ob.homePageLoading();
//		driver.navigate().back();
//		ob.designLoading();
//		driver.navigate().back();
		
		
		
	}

}
