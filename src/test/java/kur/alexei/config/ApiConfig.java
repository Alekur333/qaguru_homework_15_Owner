package kur.alexei.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/auth.properties",
        "classpath:config/api.properties"
})
public interface ApiConfig extends Config {

    @Config.Key("baseUrl")
    String baseUrl();

    @Config.Key("token")
    String token();
}
