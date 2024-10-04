package UtilityPkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtilities {
public static String getValues(String x1, String s1, int r, int c) {
	FileInputStream file;
	try {
		file= new FileInputStream(x1);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFCell cell=wb.getSheet(s1).getRow(r).getCell(c);
		if(cell.getCellType() == CellType.STRING) {
			return cell.getStringCellValue();
		}else {
			return cell.getRawValue();
		}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return "";
	}	
	
}

public static int getCellCount(String x1, String s1) {
	try {
		FileInputStream file = new FileInputStream(x1);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sh= wb.getSheet(s1);
		return sh.getLastRowNum();
		
	}catch (Exception e) {
		// TODO: handle exception
		return 0;
	}
}
}
