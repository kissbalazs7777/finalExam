package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPage {

    private WebDriver driver;
    private final By FIRST_INPUT = By.id("sum1");
    private final By SECOND_INPUT = By.id("sum2");
    private final By GET_TOTAL_BUTTON = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By DISPLAY_VALUE = By.id("displayvalue");


    public void typeInFirstInput(String num){
        driver.findElement(FIRST_INPUT).sendKeys(num);
    }

    public void typeInSecondInput(String num){
        driver.findElement(SECOND_INPUT).sendKeys(num);
    }

    public void clickOnGetTotalButton(){
        driver.findElement(GET_TOTAL_BUTTON).click();
    }

    public String getDisplayValue(){
        return driver.findElement(DISPLAY_VALUE).getText();
    }

    public InputPage(WebDriver driver) {
        this.driver = driver;
    }
}
