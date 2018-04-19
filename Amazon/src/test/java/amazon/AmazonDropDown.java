package amazon;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropDown extends CommonAPIChrome {

    @Test
    public void test(){
        chromeDriver.get("https://www.amazon.com/");

        // 1. getting drop down menu

        WebElement categoriesDropDown = chromeDriver.findElement(By.id("searchDropdownBox"));
        Select categories = new Select(categoriesDropDown);

        // 2. getting all options of menu

        List<WebElement> optionsList = categories.getOptions();
        System.out.println("The options list : ");
        for (WebElement option : optionsList) {
            System.out.println(option.getText());
        }

        // 5. Getting all selected options
        List<WebElement> allSelectedOptions = categories.getAllSelectedOptions();

        for (WebElement selectedOption : allSelectedOptions) {
            System.out.println("Selected option is : " + selectedOption.getText());
        }

        // 6. Gets first selected option

        WebElement firstSelected = categories.getFirstSelectedOption();
        System.out.println("First selected options is : " + firstSelected.getText());

        // 7. supports multiple select or not.
        System.out.println(categories.isMultiple());
    }
}
