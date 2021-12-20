package kur.alexei.tests;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import kur.alexei.config.WebDriverProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTestSelenium {

    // gradle clean test --tests WebDriverTestSelenium -Dbrowser=FIREFOX -DbaseUrl=https://github.com

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle1() {
        assertEquals("GitHub: Where the world builds software · GitHub", driver.getTitle());
        driver.quit();
    }

}
