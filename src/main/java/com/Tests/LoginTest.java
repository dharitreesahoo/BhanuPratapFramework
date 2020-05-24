package com.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.helper.excel.DataProvider1;
import com.testbase.TestBase;



public class LoginTest extends TestBase{
	@Test(dataProvider="testData2",dataProviderClass = DataProvider1.class)
	public void test1(Map<Object, Object> mapData){
		System.out.println(mapData.get("Password"));
	
	}
	/*@DataProvider(name = "testData2")
	public Object[][] dataProviderMethod2() throws Exception {
		String strSheetName = "Sheet1";
		String filePath = "d:/DataSheet.xlsx";
		Object[][] userData = getData(filePath, strSheetName);
		return userData;
	}

	public Object[][] getData(String filePath, String strSheetName) throws Exception {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(strSheetName);

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		// define a map and define an object array
		Object[][] obj = new Object[rowCount][1];

		for (int i = 0; i < rowCount; i++) {
			Map<Object, Object> dataMap = new HashMap<Object, Object>();
			for (int j = 0; j < colCount; j++) {
				dataMap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = dataMap;
		}
		return obj;
	}
*/
}
