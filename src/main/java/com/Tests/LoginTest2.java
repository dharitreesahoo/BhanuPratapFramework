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

import junit.framework.Assert;



public class LoginTest2 extends TestBase{
	@Test()
	public void TC001()
	{
		System.out.println("hello");
		this.getApplicationUrl("https://www.google.com");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test()
	public void TC002()
	{
		System.out.println("hello");
		//this.getApplicationUrl("https://www.google.com");
	}
	@Test()
	public void TC003()
	{
		System.out.println("hello");
		//this.getApplicationUrl("https://www.google.com");
	}
	@Test()
	public void TC004()
	{
		System.out.println("hello");
		//this.getApplicationUrl("https://www.google.com");
	}
}
