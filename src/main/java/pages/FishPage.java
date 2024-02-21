package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FishPage {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr/td/a")
    private List<WebElement> fishNameLinks;

    public void clickFish(String fishName){
        for (WebElement element : fishNameLinks){
            if(element.getText().equalsIgnoreCase(fishName)){
                element.click();
                break;
            }
        }
    }


}
