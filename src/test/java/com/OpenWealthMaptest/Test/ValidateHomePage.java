package com.OpenWealthMaptest.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OpenWeatherMap.Base.OpenWeatherBase;
import com.OpenWeatherMap.Pages.HomePage;

public class ValidateHomePage extends OpenWeatherBase{
	
	String HomepageLogoDescriptions="Agricultural API for Satellite and Weather data";

	public ValidateHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		
	}
	
	@Test
	public void testhomePagelables() throws IOException {
		HomePage hmpage=new HomePage();

		String HomepageLogo=hmpage.HomePagelogoText();
		System.out.println("HomePage Logo Values :" +HomepageLogo);
		if (HomepageLogo.equals(HomepageLogoDescriptions)) {
	    Assert.assertEquals(HomepageLogo, HomepageLogoDescriptions);
	    String Maptext=hmpage.getMapText();
		System.out.println("Map txt Values : " +Maptext);
		Assert.assertEquals(Maptext, "Maps");
		String Weathertext=hmpage.getWeathertext();
		System.out.println("Weathertext Values :" +Weathertext);
		Assert.assertEquals(Weathertext, "Weather");
		String APItxt=hmpage.getAPIrtext(); System.out.println("APItext valies :"+APItxt);
		Assert.assertEquals(APItxt, "API", "API Labled not  verified");
		String Blogtext=hmpage.getBlogtext();
		System.out.println("Value of BlogText : "+Blogtext);
		Assert.assertEquals(Blogtext, "Blog", "Blog Labled not  Varified");
		String labledPriceText=hmpage.getPricetext();
		System.out.println("Labled of Price :"+labledPriceText);
		Assert.assertEquals(labledPriceText, "Price", "Does Not Matched");
		
		String LableWidgetstext=hmpage.getWidgetstext();
		System.out.println("Values of Widsgets :"+LableWidgetstext);
		Assert.assertEquals(LableWidgetstext, "Widgets", "Values of Widgets Not veroified");
		
		
		String LableStationstext=hmpage.getStationstext();
		System.out.println("Values of Stations :"+LableStationstext);
		Assert.assertEquals(LableStationstext, "Stations", "Values of Stations Not veroified");
		
		String LableGuidetext=hmpage.getGuidetext();
		System.out.println("Values of Guide :"+LableGuidetext);
		Assert.assertEquals(LableGuidetext, "Guide", "Values of Guide Not veroified");
		System.out.println("All labled verified ---->Paased");
		
		 }else {
		 
		 System.out.println("Labled does not verified ----->Failed"); }
		 
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	

}
