package hellocucumber;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks extends BaseUtil {
    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest(){
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        base.driver = new FirefoxDriver();
    }

    @After
    public void tearDownTest(){
        base.driver.quit();
    }
}
