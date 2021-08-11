package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DataListPage {

    private WebDriver driver;
    private final By NAMES = By.xpath("//*[@class='searchable-container']//h4");

    public List<String> getNamesFromCards(){
        List<String> result = new ArrayList<>();
        List<WebElement> namesList = driver.findElements(NAMES);
        for (WebElement webElement : namesList) {
            result.add(webElement.getText().replace("Name: ", ""));
        }
        return result;
    }

    public DataListPage(WebDriver driver) {
        this.driver = driver;
    }
}
