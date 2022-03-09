import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();
    public CapabilitiesOptions capabilitiesOptions = new CapabilitiesOptions();

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void SetUp(String browser) throws MalformedURLException {
        //Using local Docker container to run tests on Selenium Grid
//        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
//                capabilitiesOptions.getCapabilities(browser)));


        //Using Kubernetes to run tests on Selenium Grid
//        driver.set(new RemoteWebDriver(new URL("http://127.0.0.1:8080/wd/hub"),
//                capabilitiesOptions.getCapabilities(browser)));
//        getDriver().manage().window().maximize();
    }

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "Utilities/chromedriver");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @AfterMethod
    public void TearDown() {
        getDriver().quit();
        driver.remove();
    }
}