import org.openqa.selenium.By;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utilities extends BaseTest {

    public void ClickElementByID(String id) {
        try {
            getDriver().findElement(By.id(id)).click();
        } catch (Exception e){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(screenshotFile, new File("*/target/screenshots/screenshot.png"));
        }
    }

    public void ClickElementByName(String name) {
        getDriver().findElement(By.className(name)).click();
    }

    public void NavigateToURL(String url) {
        getDriver().get("https://" + url);
    }
}