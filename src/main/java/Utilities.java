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
                String home = System.getProperty("user.home");
                String pathDir = home + "\\temp\\";
                String path = pathDir + "screenshot.jpg";
                System.out.println(dir);
                System.out.println(home);
                System.out.println(path);
                File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
                FileHandler.copy(screenshotFile, new File(path));
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