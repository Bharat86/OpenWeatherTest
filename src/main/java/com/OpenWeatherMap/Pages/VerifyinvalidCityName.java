package com.OpenWeatherMap.Pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.OpenWeatherMap.Base.OpenWeatherBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyinvalidCityName extends OpenWeatherBase {
	
	public VerifyinvalidCityName() throws IOException {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Your city name']")
	WebElement InputCityName;
	@FindBy(xpath="//form[@id='searchform']/button[@type='submit']")
	WebElement SearchBtn;
	@FindBy(xpath="//div[@id='forecast_list_ul']/div/*")
	WebElement SearchedResults;
	
	public boolean EnterCityName(String InvalidCityName) {
	 InputCityName.sendKeys(InvalidCityName);
	 return true;	
	}
	
	public void ClcikOnSearchBtn() {
		SearchBtn.click();
		
	}
	
	public String SearchedResultInvalidData() {
		String Searchedtext=SearchedResults.getText();
		return Searchedtext;
		
	}


	
	
}
