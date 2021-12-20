package kur.alexei.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${env}.properties")
public interface WebConfig extends Config {

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

    @Key("browser")
//    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
//    @DefaultValue("96.0")
    String getBrowserVersion();

    @Key("browserSize")
//    @DefaultValue("1200x800")
    String getBrowserSize();

}
