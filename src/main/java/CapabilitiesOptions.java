import org.openqa.selenium.Capabilities;

public class CapabilitiesOptions {
    public Capabilities capabilities;

    public Capabilities getCapabilities(String browser) {
        if(browser.equals("chrome")) {
            capabilities = BrowserOptions.getChromeOptions();
        }
        else
        {
            capabilities = BrowserOptions.getFireFoxOptions();
        }
        return capabilities;
    }
}