package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
WebDriver driver;

public loginPage(WebDriver driver){
	this.driver= driver;
	PageFactory.initElements(driver, this);	
}

@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732669591__header\"]/sticky-header/header/div/a[1]/account-icon")
WebElement usericon;
@FindBy(xpath = "//*[@id=\"CustomerEmail\"]")
WebElement email;

@FindBy(xpath = "//*[@id=\"CustomerPassword\"]")
WebElement password;
 
@FindBy(xpath = "//*[@id=\"customer_login\"]/button")
WebElement loginbutton;

@FindBy(xpath = "//*[@id=\"customer_login\"]/a[2]")
WebElement createaccount;

@FindBy(xpath = "//*[@id=\"customer_login\"]/a[1]")
WebElement forgotpass;

public void log() {
	usericon.click();
}
public void setData(String un, String pas) {
	
	email.clear();
	email.sendKeys(un);
	password.clear();
	password.sendKeys(pas);
	}
public void SubmitClick() {
	loginbutton.click();
}
public void forgotClick() {
	forgotpass.click();
}
public void createAccountClick() {
	createaccount.click();
}
}
