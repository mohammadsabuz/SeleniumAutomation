package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonAPIChrome {

    public WebDriver chromeDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\IdeaProjects\\Selenium\\driver\\chromedriver.exe");

        chromeDriver = new ChromeDriver();
    }

}
