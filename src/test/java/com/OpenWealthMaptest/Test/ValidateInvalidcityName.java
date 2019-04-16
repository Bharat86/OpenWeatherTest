package com.OpenWealthMaptest.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpenWeatherMap.Base.OpenWeatherBase;
import com.OpenWeatherMap.Pages.HomePage;
import com.OpenWeatherMap.Pages.VerifyinvalidCityName;
import com.OpenWeatherMap.Utllity.Utility;

public class ValidateInvalidcityName extends OpenWeatherBase {

	
	public ValidateInvalidcityName() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		
	}
	
	@Test
	public void ValidateInvalidCityData() throws IOException {
	HomePage hmpage=new HomePage();
	VerifyinvalidCityName vm=new VerifyinvalidCityName();
	vm.EnterCityName("TestIngInvalidData");
	vm.ClcikOnSearchBtn();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String SearchedResults=vm.SearchedResultInvalidData();
	System.out.println("Found Searched results "+SearchedResults);
	Assert.assertEquals(SearchedResults, "×");
	if(SearchedResults.contains("×")) {
		
		System.out.println("Test Case ValidateInvalidCityData--->PASSED ");

	}else {
		System.out.println("Test Case ValidateInvalidCityData--->FAILED ");


	}
		
		
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	


}
