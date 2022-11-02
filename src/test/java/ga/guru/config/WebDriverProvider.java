package ga.guru.config;

import org.aeonbits.owner.ConfigFactory;

class TestBaseConfig {

    private final WebConfig config;

    public TestBaseConfig() {

        this.config = ConfigFactory.create(WebConfig.class, System.getProperties());

    }

    public WebConfig get() {
        return config;
    }


}