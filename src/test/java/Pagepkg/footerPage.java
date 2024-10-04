package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class footerPage {
WebDriver driver;
public footerPage(WebDriver driver) {
	this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732604055__footer\"]/footer/div[1]/div[1]/div[1]/ul/li[1]/a")
public static WebElement terms;
@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732604055__footer\"]/footer/div[1]/div[1]/div[1]/ul/li[6]/a")
public static WebElement dtdc;
@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732604055__footer\"]/footer/div[1]/div[1]/div[2]/ul/li[1]/a")
public static WebElement duppatta;
@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732604055__footer\"]/footer/div[1]/div[1]/div[2]/ul/li[5]/a")
public static WebElement party;
//@FindBy(xpath = "/html/body/div[4]/footer/div[1]/div[2]/ul/li[1]/a/svg")
//public static WebElement fb;
//@FindBy(xpath = "/html/body/div[4]/footer/div[1]/div[2]/ul/li[2]/a/svg")
//public static WebElement insta;
//@FindBy(xpath = "/html/body/div[4]/footer/div[1]/div[2]/ul/li[3]/a/svg")
//public static WebElement yt;



//@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732604055__footer\"]/footer/div[2]/div[2]/div/small[1]/a")
//public static WebElement homelink;
//
//
//@FindBy(xpath = "//*[@id=\"shopify-section-sections--17001732604055__footer\"]/footer/div[2]/div[2]/div/small[2]/a/img")
//public static WebElement desgn;



public void termsLoading(){
	terms.click();
	String exptURL="https://ihadesigns.in/pages/terms-of-service";
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(acturl, exptURL, "failed");	
}
public void dtdcLoading(){
	dtdc.click();
	String exptURL="https://www.dtdc.in/tracking.asp";
	String acturl=driver.getCurrentUrl();
	if(acturl.equalsIgnoreCase(exptURL)) {
		System.out.println("pass");
	}else {
		System.out.println("failed");
	}
}
public void duppattaLoading(){
	duppatta.click();
	String exptURL="https://ihadesigns.in/collections/dupatta";
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(acturl, exptURL, "failed");	
}
public void partyLoading(){
	party.click();
	String exptURL="https://ihadesigns.in/collections/party-wear";
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(acturl, exptURL, "failed");	
}
//public void fbLoading(){
//	fb.click();
//	String exptURL="https://www.facebook.com/ihaboutique/";
//	String acturl=driver.getCurrentUrl();
//	Assert.assertEquals(acturl, exptURL, "failed");	
//}
//public void instaLoading(){
//	insta.click();
//	String exptURL="https://www.instagram.com/iha_designs/?igshid=YmMyMTA2M2Y%3D";
//	String acturl=driver.getCurrentUrl();
//	Assert.assertEquals(acturl, exptURL, "failed");	
//}
//public void ytLoading(){
//	yt.click();
//	String exptURL="https://www.youtube.com/channel/UC8OI7_Xqs3s-92p34uAXvBA";
//	String acturl=driver.getCurrentUrl();
//	Assert.assertEquals(acturl, exptURL, "failed");	
//}
//public void homePageLoading(){
//	homelink.click();
//	String exptURL="https://ihadesigns.in/";
//	String acturl=driver.getCurrentUrl();
//	Assert.assertEquals(acturl, exptURL, "failed");	
//}
//public void designLoading(){
//	desgn.click();
//	String exptURL="https://globosoft.in/gKart-complete-ecommerce-solution";
//	String acturl=driver.getCurrentUrl();
//	Assert.assertEquals(acturl, exptURL, "failed");	
//}



}
