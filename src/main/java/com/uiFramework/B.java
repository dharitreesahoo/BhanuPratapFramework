package com.uiFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testbase.TestBase;

public class B extends TestBase{
	int i = 1;
	
	@Test
	public void testLoginB(){
		if(i == 3){
			Assert.assertTrue(true);	
		}
		else{
			System.out.println(i);
			i++;
			Assert.assertTrue(false);	
		}	
	}

}
