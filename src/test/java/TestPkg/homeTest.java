package TestPkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basepkg.baseClass;
import Pagepkg.homePage;
import Pagepkg.loginPage;

public class homeTest extends baseClass {
//@Test

/*public void logintest2() {
	loginPage ob= new loginPage(driver);
	ob.setData("jancytesting@gmail.com", "asdf123");
	ob.SubmitClick();
	homePage ob1= new homePage(driver);
	ob1.loggingout();
}*/

@Test
public void menuSelcetionTest() throws IOException, InterruptedException {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	homePage ob= new homePage(driver);
	ob.logoclick();
	//File pagess=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileHandler.copy(pagess, new File("./screenshots/logo.png"));
	//Thread.sleep(300);
	ob.menuSelection(ob.saree);
	wait.until(ExpectedConditions.visibilityOf(ob.ksaree)).click();
	String actualURL= driver.getCurrentUrl();
	String expURL="https://ihadesigns.in/collections/kanchipuram-saree";
	if(actualURL.equals(expURL)) {
		System.out.println("K Saree page loads");
	}
	
	ob.menuSelection(ob.salwar);
	ob.menuSelection(ob.kurtis);
	ob.menuSelection(ob.newarrivals);
	ob.menuSelection(ob.ready);
	ob.menuSelection(ob.onam);
}




}
