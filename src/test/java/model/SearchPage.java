package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends MainPage{

    @FindBy(xpath = "//h1/span")
    private WebElement headerSearchResults;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getTextHeader(){
        return headerSearchResults.getText();
    }
}
