package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = ".login_logo")
    private WebElement loginLogo;

    @FindBy(xpath = "//h3")
    private WebElement errorMessage;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTextMessage(){

        return errorMessage.getText();
    }

    public ProductsPage clickLoginButton(){
        loginButton.click();
        return new ProductsPage(getDriver());
    }

    public MainPage fillUserNameField(String value){
        userNameField.sendKeys(value);
        return this;
    }

    public MainPage fillPasswordField(String value){
        passwordField.sendKeys(value);
        return this;
    }
}
