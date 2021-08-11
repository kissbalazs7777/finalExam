package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataTablePage {

    private WebDriver driver;
    private final By NAMES = By.xpath("//*[@id='example']//td[1]");
    private final By BUTTONS = By.xpath("//*[@id=\"example_paginate\"]/span/a");
    private final By NEXT_BUTTON = By.id("example_next");

    public void clickOnNextButton(){
        driver.findElement(NEXT_BUTTON).click();
    }

    public void writeNamesToFile() throws IOException {
        List<WebElement> buttonsList = driver.findElements(BUTTONS);
        FileWriter myWriter = new FileWriter("names.txt", true);
        for (int i = 0; i < buttonsList.size(); i++) {
            List<WebElement> namesList = driver.findElements(NAMES);
            for (int j = 0; j < namesList.size(); j++) {
                String name = namesList.get(j).getText();
                myWriter.write(name + "\n");
            }
            clickOnNextButton();
        }
        myWriter.close();
    }

    public DataTablePage(WebDriver driver) {
        this.driver = driver;
    }
}
