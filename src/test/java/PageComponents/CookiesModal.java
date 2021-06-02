package PageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CookiesModal {
    public CookiesModal(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[data-ref='cookie.accept-all']")
    public WebElement acceptCookiesButton;

    public void acceptCookies() {
        acceptCookiesButton.click();
    }
}
