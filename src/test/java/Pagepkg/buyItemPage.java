package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buyItemPage {
	WebDriver driver;
	public buyItemPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "/html/body/main/section[1]/slideshow-component/div/div/div[2]/div/div[2]/a")
WebElement explore;

@FindBy(xpath ="//*[@id=\"gf-tree\"]/div[2]/div[1]/div[1]/div[1]/div/span" )
WebElement collection;
@FindBy(xpath ="//*[@id=\"gf-tree\"]/div[2]/div[1]/div[1]/div[2]/div/ul/li[4]/button/span[1]" )
WebElement semisilk;
@FindBy(xpath = "/html/body/main/div[2]/div/div/div/div/div[2]/form/input")
WebElement search;

@FindBy(xpath ="/html/body/main/div[2]/div/div/div/div/div[3]/ul/div[2]/div/div[2]/div[2]/a" )
WebElement item;
@FindBy(xpath ="/html/body/main/section[1]/section/div/div/div[2]/product-info/div[5]/div[1]/quantity-input/button[2]" )
WebElement add;
@FindBy(xpath ="/html/body/main/section[1]/section/div/div/div[2]/product-info/div[5]/div[1]/quantity-input/button[1]" )
WebElement sub;
@FindBy(xpath = "//*[@id=\"Cart-note\"]")
WebElement textarea;
@FindBy(xpath = "//*[@id=\"gf-products\"]/div[2]/div/div[2]/div[2]/a")
WebElement checkout;
public void exploreEnable() {
	if(explore.isDisplayed()) {
		System.out.println("explore enabled");
	}
}

public void checkoutcart() {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(explore)).click();
	wait.until(ExpectedConditions.visibilityOf(collection)).click();
	wait.until(ExpectedConditions.visibilityOf(semisilk)).click();
	wait.until(ExpectedConditions.visibilityOf(search)).click();
	wait.until(ExpectedConditions.visibilityOf(item)).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
	wait.until(ExpectedConditions.visibilityOf(add)).click();
	wait.until(ExpectedConditions.visibilityOf(sub)).click();
	//wait.until(ExpectedConditions.visibilityOf(textarea)).sendKeys("abcdse");
	//wait.until(ExpectedConditions.visibilityOf(checkout)).click();
}

}
