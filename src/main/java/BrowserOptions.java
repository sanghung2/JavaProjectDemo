import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserOptions {
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }

    public static FirefoxOptions getFireFoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        return options;
    }
}
