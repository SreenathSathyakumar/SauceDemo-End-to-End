package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	
	private WebDriver driver;
	
	private By Fname = By.id("first-name");
	private By Lname = By.id("last-name");
	private By Pcode = By.id("postal-code");
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void checkout(String fname,String lname,String pcode) {
		driver.findElement(Fname).sendKeys(fname);
		driver.findElement(Lname).sendKeys(lname);
		driver.findElement(Pcode).sendKeys(pcode);
	}
	
}
