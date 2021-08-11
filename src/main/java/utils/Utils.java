package utils;

import org.openqa.selenium.WebDriver;

public class Utils {

    public static void navigateTo(String url, WebDriver driver){
        driver.get(url);
    }

}
