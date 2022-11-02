package ga.guru.config;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase extends TestBaseConfig {

    @BeforeAll
    static void webConfig() {
        TestBaseConfig webConfig = new TestBaseConfig();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;
        if (webConfig.get().isRemote()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = webConfig.get().getSelenoidUrl();

        }
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.browser = webConfig.get().getBrowserName();
        Configuration.browserVersion = webConfig.get().getBrowserVersion();

    }
}
