package com.tests;

import com.base.BaseTest;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BaseTest {
	@Test
public void endtoendtest() {
	LoginPage loginpage = new LoginPage(driver);
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}
}
