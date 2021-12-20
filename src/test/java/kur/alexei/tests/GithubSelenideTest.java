package kur.alexei.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import kur.alexei.config.WebConfig;
import kur.alexei.config.WebDriverProvider;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GithubSelenideTest extends TestBase {

    @Test
    public void testGithubTitle() {
        assertEquals("GitHub: Where the world builds software · GitHub", title());
    }

}
