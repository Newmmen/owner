package ga.guru.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @BeforeAll
    static void webConfig() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        if (config.isRemote()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = config.getSelenoidUrl();

        }
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();

    }
}
