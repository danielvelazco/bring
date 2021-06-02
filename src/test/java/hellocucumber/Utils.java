package hellocucumber;

import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils extends BaseUtil {

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void clicksOn(WebElement webElement) {
        webElement.click();
    }
}
