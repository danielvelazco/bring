package PageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passenger {
    public Passenger(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[uniqueid='passengers']")
    public WebElement passengerInput;

    @FindBy(css = "button[class='passengers__confirm-button ry-button--anchor-blue ry-button--anchor']")
    public WebElement doneButton;

    @FindBy(css = "[data-ref='passengers-picker__adults']")
    public WebElement adults;

    @FindBy(css = "[data-ref='passengers-picker__adults'] [data-ref='counter.counter__increment']")
    public WebElement adultsIncrementButton;

    @FindBy(css = "[data-ref='passengers-picker__children']")
    public WebElement children;

    @FindBy(css = "[data-ref='passengers-picker__children'] [data-ref='counter.counter__increment']")
    public WebElement childrenIncrementButton;

}
