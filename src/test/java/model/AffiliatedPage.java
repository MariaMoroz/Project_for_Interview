package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliatedPage extends MainPage {

    @FindBy(xpath = "//div/input[@type='text']")
    private WebElement referralLinkField;

    public AffiliatedPage(WebDriver driver) {
        super(driver);
    }

    public String getTextReferralOnAffiliated() {
        return referralLinkField.getAttribute("value");
    }

}
