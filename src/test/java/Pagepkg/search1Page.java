package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search1Page {
	WebDriver driver;
	public search1Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732669591__header\"]/sticky-header/header/div/details-modal/details/summary/span")
	WebElement searchicon;
	@FindBy(xpath = "//*[@id=\"gl-d-searchbox-input\"]")
	WebElement searchbar;
	
	public void firstsearch() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(searchicon)).click();
		wait.until(ExpectedConditions.visibilityOf(searchbar)).sendKeys("salwar",Keys.ENTER);
	}

}
