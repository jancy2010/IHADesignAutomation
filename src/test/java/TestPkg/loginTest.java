package TestPkg;

import org.testng.annotations.Test;

import com.beust.jcommander.internal.Console;

import Basepkg.baseClass;
import Pagepkg.loginPage;
import UtilityPkg.excelUtilities;

public class loginTest extends baseClass {
@Test
public void logintest1() {
loginPage ob= new loginPage(driver);
ob.log();
String x1="C:\\Users\\jubin\\Desktop\\TESTING COURSE\\projects\\loginexcel.xlsx";
String s1="Sheet1";
int count= excelUtilities.getCellCount(x1, s1);
for(int i=1;i<=count; i++) {
	String un=excelUtilities.getValues(x1, s1, i, 0);
	System.out.println("user id "+i+ " : "+un);
	String pas=excelUtilities.getValues(x1, s1, i, 1);
	System.out.println("password"+i+ " : "+pas);
	ob.setData(un, pas);
	ob.SubmitClick();
	String expurl="https://ihadesigns.in/account";
	String actualurl=driver.getCurrentUrl();
	if(expurl.equals(actualurl)) {
		System.out.println("succesfuly login");
		break;
	}
}
}
}
