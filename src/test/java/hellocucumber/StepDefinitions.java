package hellocucumber;

import Base.BaseUtil;
import PageComponents.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class StepDefinitions extends BaseUtil {
    private BaseUtil base;

    public StepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("User navigate to the app")
    public void user_navigate_to_the_app() throws Throwable {
        base.driver.navigate().to("https://www.ryanair.com/gb/en");
    }

    @When("User accepts cookies")
    public void user_accept_cookies() {
        CookiesModal cookiesModal = new CookiesModal(base.driver);
        cookiesModal.acceptCookies();
    }

    @When("User selects flights")
    public void user_select_flights() {
        FlightSearch flightSearch = new FlightSearch(base.driver);
        Country country = new Country(base.driver);
        Airport airport = new Airport(base.driver);
        Utils utils = new Utils(base.driver);
        WebDriverWait wait = new WebDriverWait(base.driver, 30);

        // Select departure flight
        utils.clicksOn(flightSearch.departureInput);
        wait.until(ExpectedConditions.visibilityOf(country.menu));

        // Select departure country
        utils.clicksOn(country.portugal);
        wait.until(ExpectedConditions.visibilityOf(airport.menu));

        // Select departure airport
        utils.clicksOn(airport.lisbon);
        wait.until(ExpectedConditions.visibilityOf(country.menu));

        // Select destination flight
        // Select destination country
        utils.clicksOn(country.france);
        wait.until(ExpectedConditions.visibilityOf(airport.menu));

        // Select destination airport
        utils.clicksOn(airport.parisBeauvais);
    }
    @When("User selects dates")
    public void user_select_dates() {
        WebDriverWait wait = new WebDriverWait(base.driver, 30);
        DatePicker datePicker = new DatePicker(base.driver);
        Utils utils = new Utils(base.driver);

        wait.until(ExpectedConditions.visibilityOf(datePicker.calendar));
        utils.clicksOn(datePicker.departMonth);
        utils.clicksOn(datePicker.departDay);
        utils.clicksOn(datePicker.returnMonth);
        utils.clicksOn(datePicker.returnDay);

    }

    @When("User selects passengers")
    public void user_selects_passengers() {
        WebDriverWait wait = new WebDriverWait(base.driver, 30);
        Passenger passenger = new Passenger(base.driver);
        Utils utils = new Utils(base.driver);
        FlightSearch flightSearch = new FlightSearch(base.driver);

        utils.clicksOn(passenger.passengerInput);
        utils.clicksOn(passenger.adultsIncrementButton);
        utils.clicksOn(passenger.childrenIncrementButton);
        utils.clicksOn(flightSearch.searchButton);

    }

    @When("User updates dates")
    public void user_updates_dates() {
        WebDriverWait wait = new WebDriverWait(base.driver, 30);
        FlightEdit flightEdit = new FlightEdit(base.driver);
        Utils utils = new Utils(base.driver);
        wait.until(ExpectedConditions.visibilityOf(flightEdit.departNextDateButton));

        //utils.clicksOn(flightEdit.departNextDateButton);

        /*boolean var = false;
        do {
            try {
                if (flightEdit.newDepartDate.isDisplayed() == true) {
                    flightEdit.departNextDateButton.click();
                    var = true;
                }
            }
            catch (Exception e) {
                utils.clicksOn(flightEdit.departNextDateButton);
            }
        } while (var == true);
        //flightEdit.newDepartDate.click();*/



    }

}