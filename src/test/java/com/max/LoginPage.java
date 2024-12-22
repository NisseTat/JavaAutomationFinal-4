package com.max;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Локаторы
    private By emailInput = By.xpath("//input[@type='email']");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By emailError = By.xpath("//div[@class='error'][1]"); // Пример локатора для ошибки email
    private By passwordError = By.xpath("//div[@class='error'][2]"); // Пример локатора для ошибки пароля

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isEmailErrorVisible() {
        return !driver.findElements(emailError).isEmpty();
    }

    public boolean isPasswordErrorVisible() {
        return !driver.findElements(passwordError).isEmpty();
    }
}