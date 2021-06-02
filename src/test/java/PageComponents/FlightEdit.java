package PageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightEdit {
    public FlightEdit(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='carousel ng-tns-c81-9']")
    public WebElement departCarrousel;

    @FindBy(css = "[class='carousel ng-tns-c81-12']")
    public WebElement returnCarrousel;

    @FindBy(css = /*"[class='carousel ng-tns-c81-9'] */"button[data-e2e='carousel-next']")
    public WebElement departNextDateButton;

    @FindBy(css = "[data-ref='2021-12-06']")
    public WebElement newDepartDate;


}
