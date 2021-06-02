package PageComponents;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker extends BaseUtil {
    public DatePicker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-ref='fsw-datepicker-container__from']")
    public WebElement calendar;

    @FindBy(xpath = "//div[contains(@data-ref,'m-toggle-months-item') and contains(text(),'Jun')]")
    public WebElement departMonth;

    @FindBy(css = "[data-id='2021-06-06']")
    public WebElement departDay;

    @FindBy(xpath = "//div[contains(@data-ref,'m-toggle-months-item') and contains(text(),'Oct')]")
    public WebElement returnMonth;

    @FindBy(css = "[data-id='2021-10-30']")
    public WebElement returnDay;
}
