package utilities;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;


import static utilities.Driver.getDriver;

public class ReusableMethods {

    //========ScreenShot Web Element(Bir webelementin resmini alma)=====//
    public static String getScreenshotWebElement(String name, WebElement element) throws IOException {
        String date = new SimpleDateFormat("yyyy-MM-dd-hhmm").format(new Date());

        // TakesScreenshot, ekran görüntüsünü alan bir selenyum arayüzüdür.
        File source = element.getScreenshotAs(OutputType.FILE);

        // ekran görüntüsü konumunun tam yolu
        String wElementSS = System.getProperty("user.dir") + "/target/WElementScreenshots/" + name + "_" + date + ".png";
        File finalDestination = new File(wElementSS);

        // ekran görüntüsünü verilen yola kaydedin
        FileUtils.copyFile(source, finalDestination);
        return wElementSS;
    }//

    public static Select select(WebElement ddm) { //select method

        Select select;

        return select = new Select(ddm);
    }//

    public static void jsScrollClick(WebElement webElement) {  //kaydir ve tikla
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        try {
            webElement.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].scrollIntoView(true);", webElement);
            js.executeScript("arguments[0].click()", webElement);
        }
    }

    public static void waitFor(int sec) { //bekle

        try {
            Thread.sleep(sec * 1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static Random random() { //

        Random random;
        return random = new Random();
    }

}