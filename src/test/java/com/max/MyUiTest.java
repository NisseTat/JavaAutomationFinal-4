package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyUiTest extends BaseTest {

    @Test
    void testGBNotEmailLogin() {
        driver.get("https://gb.ru/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("login");
        loginPage.enterPassword("password");
        loginPage.clickLogin();

        Assertions.assertTrue(loginPage.isEmailErrorVisible());
    }

    @Test
    void testGBWithoutPassword() {
        driver.get("https://gb.ru/login");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("login@login.ru");
        loginPage.clickLogin();

        Assertions.assertTrue(loginPage.isPasswordErrorVisible());
    }
}