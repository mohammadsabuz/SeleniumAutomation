package gmailTestsChrome;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailChrome extends CommonAPIChrome {

    @Test
    public void Gmail(){
        chromeDriver.get("https://www.gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("fakeemail@gmail.com");
        chromeDriver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
    }
}
