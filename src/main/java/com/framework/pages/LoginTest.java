package com.framework.pages;

import org.testng.annotations.Test;

import com.framework.base.BaseTest;
import com.framework.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        System.out.println("Login Successful");
    }
}