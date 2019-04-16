package com.OpenWeatherMap.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenWeatherMap.Base.OpenWeatherBase;

public class HomePage extends OpenWeatherBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);

	}
	//Difining Xpath--
	@FindBy(xpath = "//div[@class='owm-block-mainpage__card']/h2[text()='Agricultural API for Satellite and Weather data']")
	WebElement getlogo;
	@FindBy(xpath = "//a[@class='nav__link dropdown-toggle bg-hover-color']")
	WebElement getLablesMap;
	@FindBy(xpath = "//a[@class='nav__link bg-hover-color' and text()='Weather']")
	WebElement getLablesWeather;

	@FindBy(xpath="//a[text()='API']") WebElement getAPI;

	@FindBy(xpath="//*[@id='undefined-sticky-wrapper']/div/div/div/div[2]/ul/li[5]/a")
	WebElement getGuide;

	@FindBy(xpath="//a[text()='Price']") WebElement getPrice;

	@FindBy(xpath="//a[text()='Stations']") WebElement getStations;

	@FindBy(xpath="//*[@id='undefined-sticky-wrapper']/div/div/div/div[2]/ul/li[11]/a") 
	WebElement getBlog;

	@FindBy(xpath="//a[text()='Partners']") WebElement getPartners;

	@FindBy(xpath="//a[text()='Widgets']") WebElement getWidgets;


	//Difining Methods
	public String HomePagelogoText() {
		String HomepageLogo=getlogo.getText();
		return HomepageLogo;
	}
	public String getMapText() {
		String Lablemap=getLablesMap.getText();
		return Lablemap;	
	}
	public String getWeathertext() {
		String LablesWeather=getLablesWeather.getText();
		return LablesWeather;	
	}

	public String getBlogtext() {
		String LablesBlog=getBlog.getText(); return
				LablesBlog; }
	public String getAPIrtext() {
		String LablesAPI=getAPI.getText(); return LablesAPI;
	}
	public String getPricetext()
	{
		String LablesPrice=getPrice.getText(); 
		return LablesPrice; 
	} 
	public String getStationstext() {
		String LablesStations=getStations.getText();
		return LablesStations;
	}
	public String getWidgetstext() { 
		String LablesWidgets=getWidgets.getText(); 
		return LablesWidgets; 
	}
	
	public String getGuidetext() { 
		String LablesGuide=getGuide.getText(); 
		return LablesGuide; 
	}

}
