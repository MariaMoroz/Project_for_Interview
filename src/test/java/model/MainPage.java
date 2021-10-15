package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(css = "#globalSearch")
    private WebElement searchField;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage fillSearchField(String value){
        searchField.sendKeys(value + "\n");
        return new SearchPage(getDriver());
    }

}
