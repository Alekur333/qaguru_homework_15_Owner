package kur.alexei.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import kur.alexei.helpers.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.String.format;

public class TestBase {

    @BeforeAll
    public static void beforeTest() {

        Configuration.browserSize="1200x800";
//        Configuration.proxyEnabled = true; // только для отдельных тестов, а не в общие настройки
//        Configuration.fileDownload = FileDownloadMode.PROXY; // для скачивания файлов без href, только для отдельных тестов, а не в общие настройки

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        // поле credentials для сбора данных из config/credentials.properties
        CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
//        String login = credentials.login();
//        String password = credentials.password();
//        String url = System.getProperty("url", credentials.url());
//        String remoteUrl = format("https://%s:%s@%s",  login, password, url);
        // удаленный адрес для запуска тестов в Jenkins
//        Configuration.remote = remoteUrl;
//        System.out.println(selenoidUrl);

        // для записи видео в отчеты
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
