package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.time.Duration;

public class Browser {
    WebDriver driver;
    String url= "https://petstore.octoperf.com/actions/Catalog.action";
    String browserName= "Firefox";

    public HomePage openBrowser(){
        if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else {
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return PageFactory.initElements(driver, HomePage.class);


    }
    public WebDriver getDriver(){
        return driver;
    }
}
