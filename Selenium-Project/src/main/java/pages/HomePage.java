package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage {

    // Declaring web elements at class level
    @FindBy(id = "txtUsername") private WebElement userNameElement;
    @FindBy(id = "txtPassword") private WebElement passwordElement;
    @FindBy(id = "btnLogin") private WebElement loginButton;

    public void logIn() {
        userNameElement.sendKeys(Browser.getPropertyValue("userName"));
        passwordElement.sendKeys(Browser.getPropertyValue("password"));
        loginButton.click();
    }
}
