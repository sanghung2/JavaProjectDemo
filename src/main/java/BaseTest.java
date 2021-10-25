import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public CapabilitiesOptions capabilitiesOptions = new CapabilitiesOptions();

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void SetUp(String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                capabilitiesOptions.getCapabilities(browser)));
        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void TearDown() {
        getDriver().quit();
    }

    @AfterClass void Terminate() {
        driver.remove();
    }
}
