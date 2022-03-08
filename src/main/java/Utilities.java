import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriverException;

import org.testng.annotations.Test;

public class Utilities extends BaseTest {

    public void ClickElementByID(String id) {
        try {
            getDriver().findElement(By.id(id)).click();
        } catch (WebDriverException e) {
            try {
                String dir = System.getProperty("user.dir");
                String pathDir = dir + "/a/target/screenshots/screenshot.png";
                //System.out.println(pathDir);
                File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
                System.out.println(screenshotFile);
                FileHandler.copy(screenshotFile, new File(pathDir));
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
    }

    public void ClickElementByName(String name) {
        getDriver().findElement(By.className(name)).click();
    }

    public void NavigateToURL(String url) {
        getDriver().get("https://" + url);
    }
}