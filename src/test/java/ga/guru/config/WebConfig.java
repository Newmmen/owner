package ga.guru.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties"
})

public interface WebConfig extends Config {

    @Key("selenide.remote")
    String getSelenoidUrl();

    @Key("isRemote")
    Boolean isRemote();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("browser.name")
    String getBrowserName();


}
