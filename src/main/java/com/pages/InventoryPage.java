package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	private WebDriver driver ; 
	
	private By Addtocart = By.id("add-to-cart-sauce-labs-backpack");
	private By cartlink = By.xpath("//a[@class='shopping_cart_link']");
	private By checkout = By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button \"]");
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void inventoryflow() {
		driver.findElement(Addtocart).click();
		driver.findElement(cartlink).click();
		driver.findElement(checkout).click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
