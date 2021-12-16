package config;

import org.aeonbits.owner.Config;

// Конструктор для пользования данных из config/credentials.properties
@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {
    String firstName();
    String lastName();
    String login();
    String password();
    String url();


}
