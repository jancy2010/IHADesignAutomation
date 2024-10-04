package Pagepkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class searchPage {
WebDriver driver;
public searchPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=\"HeaderMenu-salwar-suits\"]/a")
WebElement salwar;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/form/input")
WebElement searchbar;

public void search() {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
	salwar.click();
	//wait.until(ExpectedConditions.visibilityOf(searchicon)).click();
	wait.until(ExpectedConditions.visibilityOf(searchbar)).sendKeys("salwar", Keys.ENTER);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	File pagess=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(pagess, new File("d://Screenshot//salwarresults.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
