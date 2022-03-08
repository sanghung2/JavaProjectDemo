import org.openqa.selenium.By;

public class Utilities extends BaseTest {

    public void ClickElementByID(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public void ClickElementByName(String name) {
        getDriver().findElement(By.className(name)).click();
    }

    public void NavigateToURL(String url) {
        getDriver().get("https://" + url);
    }
}