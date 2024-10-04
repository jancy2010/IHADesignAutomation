package Pagepkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class registerPage {
WebDriver driver;
public registerPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732669591__header\"]/sticky-header/header/div/a[1]/account-icon")
WebElement usericon;
@FindBy(xpath = "//*[@id=\"customer_login\"]/a[2]")
WebElement create;
@FindBy(xpath = "//*[@id=\"RegisterForm-FirstName\"]")
WebElement username;
@FindBy(xpath = "//*[@id=\"RegisterForm-LastName\"]")
WebElement lname;
@FindBy(xpath = "//*[@id=\"RegisterForm-email\"]")
WebElement email;
@FindBy(xpath = "//*[@id=\"RegisterForm-password\"]")
WebElement pass;	
@FindBy(xpath = "//*[@id=\"create_customer\"]/button")
WebElement submit;


public void reg() {
	//WebDriverWait wait= WebDriverWait(driver,Duration.ofSeconds(50));
	usericon.click();
	create.click();
	username.sendKeys("abc",Keys.ENTER);
	lname.sendKeys("abc124",Keys.ENTER);
	email.sendKeys("abc@gmail.com",Keys.ENTER);
	pass.sendKeys("abc@123",Keys.ENTER);
	submit.click();
	File pagess=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(pagess, new File("d://Screenshot//registration.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


private WebDriverWait WebDriverWait(WebDriver driver2, Duration ofSeconds) {
	// TODO Auto-generated method stub
	return null;
}
}
