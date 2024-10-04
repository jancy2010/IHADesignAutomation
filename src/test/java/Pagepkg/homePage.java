package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Multiset.Entry;

public class homePage {
WebDriver driver;
public homePage(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=\"shopify-section-template--17001736470679__main\"]/div/div[1]/a")
WebElement logout;

@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732669591__header\"]/sticky-header/header/h1/a/div/img")
public static WebElement logo;

@FindBy(xpath = "//*[@id=\"HeaderMenu-saree\"]/a")
public static WebElement saree;
@FindBy(xpath = "//*[@id=\"HeaderMenu-saree-kanchipuram-saree\"]")
public static WebElement ksaree;

@FindBy(xpath = "//*[@id=\"HeaderMenu-salwar-suits\"]/a")
public static WebElement salwar;

@FindBy(xpath = "//*[@id=\"HeaderMenu-kurtis\"]/a")
public static WebElement kurtis;
@FindBy(xpath = "//*[@id=\"HeaderMenu-ready-made\"]/a")
public static WebElement ready;
@FindBy(xpath = "//*[@id=\"HeaderMenu-new-arrivals\"]/span")
public static WebElement newarrivals;
@FindBy(xpath = "//*[@id=\"HeaderMenu-onam-special\"]/span")
public static WebElement onam;

@FindBy(xpath = "//*[@id=\"Slide-template--17001736732823__slideshow_wcVGKg-1\"]/div[2]/div/div[2]/a")
public static WebElement explore;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[1]/div[1]/div/span")
public static WebElement collection;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button/span[1]")
public static WebElement georgette;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[1]/div[2]/div/ul/li[7]/button/span[1]")
public static WebElement bestseller;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[1]/div[2]/div/ul/li[13]/button/span[1]")
public static WebElement madeby;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[2]/div[1]/div/span")
public static WebElement category;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[2]/div[2]/div/ul/li/button/span[1]")
public static WebElement nocatogory;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[3]/div[1]/div/span")
public static WebElement vendor;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[3]/div[2]/div/ul/li/button/span[1]")
public static WebElement vendor1;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[3]/div[2]/div/ul/li/button/span[1]")
public static WebElement producttype;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[3]/div[2]/div/ul/li[2]/button/span[1]")
public static WebElement saree1;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[4]/div[1]/div/span")
public static WebElement price;
@FindBy(xpath = "//*[@id=\"min-17038\"]")
public static WebElement minprice;
@FindBy(xpath = "//*[@id=\"max-17038\"]")
public static WebElement maxprice;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[5]/div[1]/div/span")
public static WebElement availability;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[5]/div[2]/div/ul/li[2]/button/span[1]")
public static WebElement instock;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[6]/div[1]/div/span")
public static WebElement tag;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[6]/div[2]/div/ul/li[1]/button/span[1]")
public static WebElement allsaree;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[7]/div[1]/div/span")
public static WebElement readyship;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[7]/div[2]/div/ul/li/button/span[1]")
public static WebElement readytoship;

@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[8]/div[1]/div/span")
public static WebElement colour;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[7]/div[2]/div/ul/li[1]/button/span[1]")
public static WebElement beige;
@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[1]/div[7]/div[2]/div/ul/li[2]/button/span[1]")
public static WebElement cream;


@FindBy(xpath = "//*[@id=\"gf-tree\"]/div[2]/div[2]/label/span")
public static WebElement sortby;
@FindBy(xpath = "//*[@id=\"globo-dropdown-sort_options\"]/span[3]")
public static WebElement atoz;


@FindBy(xpath = "//*[@id=\"gf-products\"]/div[4]/div/div[1]/form/button/span")
public static WebElement itemselected;
@FindBy(xpath = "//*[@id=\"gf-products\"]/div[1]/div/div[2]/div[2]/a")
public static WebElement add;
@FindBy(xpath = "//*[@id=\"CartItem-1\"]/td[4]/quantity-popover/div[1]/div/quantity-input/button[1]")
public static WebElement sub;

@FindBy(xpath = "//*[@id=\"Cart-note\"]")
public static WebElement comentbox;
@FindBy(xpath = "//*[@id=\"checkout\"]")
public static WebElement checkout;
	
@FindBy(xpath = "//*[@id=\"collection-template--17001736732823__featured_collection_xipw9y\"]/slider-component/div/button[2]/svg/path")
public static WebElement nextbutton;
@FindBy(xpath = "//*[@id=\"collection-template--17001736732823__featured_collection_xipw9y\"]/slider-component/div/button[1]/svg")
public static WebElement prevbutton;
@FindBy(xpath = "//*[@id=\"CardLink-template--17001736732823__featured_collection_xipw9y-8568468570263\"]")
public static WebElement imageselected;
@FindBy(xpath = "//*[@id=\"variant-selects-template--17001736896663__main\"]/fieldset/label[5]")
public static WebElement blue;
@FindBy(xpath = "//*[@id=\"Slide-Thumbnails-template--17001736896663__main-4\"]/button")
public static WebElement image3;
@FindBy(xpath = "//*[@id=\"Quantity-Form-template--17001736896663__main\"]/div[1]/quantity-input/button[2]")
public static WebElement ad;
@FindBy(xpath = "//*[@id=\"Quantity-Form-template--17001736896663__main\"]/div[1]/quantity-input/button[1]")
public static WebElement su;
@FindBy(xpath = "//*[@id=\"ProductSubmitButton-template--17001736896663__main\"]")
public static WebElement adcart;
//@FindBy(xpath = "")
//public static WebElement close;
//@FindBy(xpath = "//*[@id=\"product-form-template--17001736896663__main\"]/div/div/div/div/div/button[1]")
//public static WebElement buynow;
@FindBy(xpath = "//*[@id=\"cart-icon-bubble\"]/svg/path")
public static WebElement carton; 
@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732669591__header\"]/sticky-header/header/div/details-modal/details/summary/span/svg[1]")
public static WebElement search;

public void search() {
	search.sendKeys("salwar",Keys.ENTER);
}





public void menuSelection(WebElement item) {
	Actions act= new Actions(driver);
	act.moveToElement(item).perform();

	
}
public void logoclick() {
	 boolean a= logo.isDisplayed();
	 if(a) {
		 System.out.println("logo displayed");
	 }
	 else 
	 {
		 System.out.println("logo not displayed");}
			
		}
	

public void loggingout() {
	logout.click();
}
}
