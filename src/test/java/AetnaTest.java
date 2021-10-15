import model.MainPage;
import model.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.Base;

import java.util.Arrays;
import java.util.List;

public class AetnaTest extends Base{

    @Test
    public void searchEmployersTest() {

        String expectedTextOfHeader = "Search Results";
        String expextedResult =  "Employers Take on SDoH Through Analytics";

        SearchPage searchPage = new MainPage(getDriver())
                .fillSearchField("Employers");

        Assert.assertEquals(searchPage.getTextHeader(), expectedTextOfHeader);
        Assert.assertEquals(searchPage.getRowCount(), 10);
        Assert.assertTrue(searchPage.getListResults().contains(expextedResult));
    }
}
