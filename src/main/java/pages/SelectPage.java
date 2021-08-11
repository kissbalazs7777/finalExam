package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {

    private WebDriver driver;
    private final By SELECT_FROM = By.id("select-demo");
    private final By SELECTED_DAY = By.className(("selected-value"));

    public void selectFromList(String option){
        Select select = new Select(driver.findElement(SELECT_FROM));
        select.selectByValue(option);
    }

    public String getSelectedValue(){
        return driver.findElement(SELECTED_DAY).getText().replace("Day selected :- ", "");
    }

    public SelectPage(WebDriver driver) {
        this.driver = driver;
    }
}
