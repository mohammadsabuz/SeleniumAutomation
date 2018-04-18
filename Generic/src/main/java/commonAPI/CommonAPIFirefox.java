package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonAPIFirefox {

    public WebDriver geckoDriver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\moham\\IdeaProjects\\Selenium\\driver\\geckodriver.exe");

        geckoDriver = new FirefoxDriver();
    }

}
