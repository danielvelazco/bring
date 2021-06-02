package PageComponents;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlightSearch extends BaseUtil {

    public FlightSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[uniqueid='departure']")
    public WebElement departureInput;

    @FindBy(css = "[uniqueid='destination']")
    public WebElement destinationInput;

    @FindBy(css = "[data-ref='flight-search-widget__cta']")
    public WebElement searchButton;

}
