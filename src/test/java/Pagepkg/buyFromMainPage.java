package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buyFromMainPage {
WebDriver driver;
public buyFromMainPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
                     
@FindBy(xpath = "//*[@id=\"collection-template--17001736732823__featured_collection_xipw9y\"]/slider-component/div/button[2]/svg")
public static WebElement nextbutton;                  
@FindBy(xpath = "//*[@id=\"collection-template--17001736732823__featured_collection_xipw9y\"]/slider-component/div/button[1]/svg")
public static WebElement prevbutton;
@FindBy(xpath = "//*[@id=\"CardLink-template--17001736732823__featured_collection_xipw9y-8550489063575\"]")
public static WebElement imageselected;
@FindBy(xpath = "//*[@id=\"variant-selects-template--17001736896663__main\"]/fieldset[1]/label[5]")
public static WebElement blue;
@FindBy(xpath = "//*[@id=\"variant-selects-template--17001736896663__main\"]/fieldset[2]/label[2]")
public static WebElement small;
@FindBy(xpath = "//*[@id=\"Quantity-Form-template--17001736896663__main\"]/div[1]/quantity-input/button[2]")
public static WebElement ad;
@FindBy(xpath = "//*[@id=\"Quantity-Form-template--17001736896663__main\"]/div[1]/quantity-input/button[1]")
public static WebElement su;
@FindBy(xpath = "//*[@id=\"ProductSubmitButton-template--17001736896663__main\"]")
public static WebElement adcart;

public void buyItem() {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	//wait.until(ExpectedConditions.visibilityOf(nextbutton)).click();
	//wait.until(ExpectedConditions.visibilityOf(nextbutton)).click();
	//wait.until(ExpectedConditions.visibilityOf(prevbutton)).click();
	wait.until(ExpectedConditions.visibilityOf(imageselected)).click();
	
	wait.until(ExpectedConditions.visibilityOf(blue)).click();

	wait.until(ExpectedConditions.visibilityOf(small)).click();
	
	wait.until(ExpectedConditions.visibilityOf(adcart)).click();
}
}
