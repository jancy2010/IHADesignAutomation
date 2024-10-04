package TestPkg;


import org.testng.annotations.Test;

import Basepkg.baseClass;

import Pagepkg.searchPage;

public class searchItem extends baseClass{
	
	@Test
	public void search() {
		searchPage ob= new searchPage(driver);
		ob.search();
	}
}
