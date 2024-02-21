
import browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.FishPage;

public class JPetStoreTest {
    @Test
    public void test1() {
        Browser browser = new Browser();
        browser.openBrowser().clickLinkElement("FISH");

        PageFactory.initElements(browser.getDriver(), FishPage.class)
                .clickFish("FI-SW-01");

    }

}


