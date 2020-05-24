package com.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.helper.assertion.VerificationHelper;
import com.helper.browserConfiguration.config.ObjectReader;
import com.helper.javaScript.JavaScriptHelper;
import com.helper.logger.LoggerHelper;
import com.helper.wait.WaitHelper;
import com.testbase.TestBase;


public class LoginPage{
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	WaitHelper waitHelper;
	
	
	

}
