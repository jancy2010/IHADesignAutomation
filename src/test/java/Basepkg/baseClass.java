package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseClass {
public static WebDriver driver;
String baseurl="https://ihadesigns.in";
@BeforeClass
public void setUp() {
	driver= new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}
}
