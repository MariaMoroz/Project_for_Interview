import model.MainPage;
import model.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.Base;

public class AetnaTest extends Base{

    @Test
    public void searchEmployersTest() throws InterruptedException {

        String expectedTextOfHeader = "Search Results";
        Thread.sleep(3000);
        SearchPage searchPage = new MainPage(getDriver())
                .fillSearchField("Employers");
        Thread.sleep(3000);

        Assert.assertEquals(searchPage.getTextHeader(), expectedTextOfHeader);
    }
}
