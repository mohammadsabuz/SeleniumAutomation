package letscodeit;

import commonAPI.CommonAPIFirefox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LetsCodeIt extends CommonAPIFirefox {

    @Test
    public void test(){
        geckoDriver.get("https://letskodeit.teachable.com/p/practice");
        WebElement element = geckoDriver.findElement(By.id("carselect"));
        Select select = new Select(element);

        select.selectByValue("bmw");
        select.selectByIndex(1);
        select.selectByVisibleText("Honda");

        System.out.println("Print the list of all options");
        List<WebElement> options = select.getOptions();
        int size = options.size();

        for (int i = 0; i < size; i++){
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }
    }

    @AfterMethod
    public void after(){
        geckoDriver.close();
    }
}
