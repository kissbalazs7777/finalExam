package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpPage {

    private WebDriver driver;
    private final By LUNCH_MODAL_BUTTON = By.xpath("//a[@href='#myModal0']");
    private final By MODAL_TEXT = By.xpath("//*[@id=\"myModal0\"]//div[3]");
    private final By CLOSE_BUTTON = By.xpath("//*[@id=\"myModal0\"]//a[1]");
    private final By MODAL = By.xpath("//*[@class='modal fade in']");

    public void clickOnLunchModalButton(){
        driver.findElement(LUNCH_MODAL_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MODAL));
    }

    public String getModalText(){
        return driver.findElement(MODAL_TEXT).getText();
    }

    public void clickOnCloseButton(){
        driver.findElement(CLOSE_BUTTON).click();
    }

    public PopUpPage(WebDriver driver) {
        this.driver = driver;
    }
}
