package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends MainPage{

    @FindBy(xpath = "//h1/span")
    private WebElement headerSearchResults;

    @FindBy(xpath = "//li/h2/a")
    private List<WebElement> listSearchResults;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getTextHeader(){
        return headerSearchResults.getText();
    }

    public List<String> getListResults(){
        return listSearchResults.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public int getRowCount() {

        return listSearchResults.size();
    }

}
