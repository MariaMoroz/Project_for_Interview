package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MainPage {

    @FindBy(id = "1-email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passField;

    @FindBy(name = "submit")
    private WebElement loginButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage fillEmail() {
        emailField.sendKeys("ponomid@ya.ru");

        return this;
    }

    public SignInPage fillPass() {
        passField.sendKeys("Smmtool88");

        return this;
    }

    public ProfilePage clickLogin() {
        loginButton.click();

        return new ProfilePage(getDriver());
    }
}
