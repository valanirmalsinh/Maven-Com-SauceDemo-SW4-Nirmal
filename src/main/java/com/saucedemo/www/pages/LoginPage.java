package com.saucedemo.www.pages;

import com.saucedemo.www.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By headingText = By.xpath("//span[@class='title']");
    By emailField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");
    By number=By.xpath("//div[@class='inventory_item']");
    public String getHeadingText(){
        return getTextFromElement(headingText);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public int countItem(){
        return countItem(number);
    }
}
