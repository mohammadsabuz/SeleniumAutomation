package gmailTestsFirefox;

import commonAPI.CommonAPIFirefox;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailFirefox extends CommonAPIFirefox{

    @Test
    public void Gmail(){
        geckoDriver.get("https://www.gmail.com");
        geckoDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("fakeemail@gmail.com");
        geckoDriver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();


    }

}
