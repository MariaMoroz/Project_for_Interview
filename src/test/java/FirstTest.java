import Base.Base;
import model.MainPage;
import model.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends Base {

    @Test
    public void navigatePage(){

        Assert.assertTrue(new MainPage(getDriver())
                .isLogoDisplayed());
        Assert.assertTrue(new MainPage(getDriver())
                .isPictureDisplayed());
        Assert.assertTrue(new MainPage(getDriver())
                .isUserNameFieldDisplayed());
        Assert.assertTrue(new MainPage(getDriver())
                .isPasswordFieldDisplayed());

    }

    @Test
    public void verifyLogin(){
        String userNameValue = "standard_user";
        String passwordValue = "secret_sauce";
        String expectedHeaderText = "PRODUCTS";

        ProductsPage productsPage = new MainPage(getDriver())
                .fillUserNameField(userNameValue)
                .fillPasswordField(passwordValue)
                .clickLoginButton();

        Assert.assertEquals(productsPage.getHeaderText(), expectedHeaderText);

    }
}
