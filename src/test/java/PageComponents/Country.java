package PageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Country {
    public Country(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='airports__countries ng-star-inserted']")
    public WebElement menu;

    @FindBy(xpath = "//span[contains(@class,'countries__country-inner') and contains(text(),'Portugal')]")
    public WebElement portugal;

    @FindBy(xpath = "//span[contains(@class,'countries__country-inner') and contains(text(),'France')]")
    public WebElement france;

}
