package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends MainPage{

    @FindBy(css = ".title")
    private WebElement headerPage;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText(){
        return headerPage.getText();
    }
}
