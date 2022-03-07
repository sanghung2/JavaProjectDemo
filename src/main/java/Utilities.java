import org.openqa.selenium.By;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Utilities extends BaseTest {

    public void ClickElementByID(String id) {
        try {
            getDriver().findElement(By.id(id)).click();
        } catch (Exception e){
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("*/target/screenshots/screenshot.png"));
        }
    }

    public void ClickElementByName(String name) {
        getDriver().findElement(By.className(name)).click();
    }

    public void NavigateToURL(String url) {
        getDriver().get("https://" + url);
    }
}