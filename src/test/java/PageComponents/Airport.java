package PageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airport {
    public Airport(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class='airports__right-panel ng-star-inserted']")
    public WebElement menu;

    @FindBy(css = "span[data-id='LIS']")
    public WebElement lisbon;

    @FindBy(css = "span[data-id='BVA']")
    public WebElement parisBeauvais;
}
