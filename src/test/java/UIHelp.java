import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

enum Browser {
    CHROME("CHROME"),;

    private final String value;

    Browser(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public class UIHelp {
        private WebDriver getLocalDriver(Browser browser) {
            WebDriver driver;

            switch (browser) {
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver-v2.37-win32.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("disable-infobars");

                    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                    capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                    driver = new ChromeDriver(capabilities);
                    driver.manage().window().setSize(new Dimension(1920, 1080));
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }
            return driver;
        }

    }
}
