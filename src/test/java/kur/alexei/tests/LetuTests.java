package kur.alexei.tests;

import io.qameta.allure.Description;
import kur.alexei.helpers.DriverUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class LetuTests extends TestBase {


    @Test
    @Tag("letuMainPage")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.letu.ru/'", () ->
                open("https://www.letu.ru/"));

        step("Page title should have text 'L'Etoile'", () -> {
            String expectedTitle = "L'Etoile";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Tag("letuMainPage")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.letu.ru/'", () ->
                open("https://www.letu.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Tag("letuMainPage")
    @Tag("mainMenuItems")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Main page has main menu items")
    void mainPageHasMainMenuItemsTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("main menu items not null", () -> {
            $$(".main-menu-rd-items .main-menu-rd-item").shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    @Disabled("For Allure report")
    @Tag("letuMainPage")
    @Tag("cleanBeauty")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Main page has 'Clean beauty' item in main menu")
    void shouldBeCleanBeautyInMainMenuTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Clean beauty' exist in main menu items", () -> {
            $(".main-menu-rd-items").$(withText("Clean beauty")).shouldBe(exist);
        });

    }

    @Test
    @Tag("letuMainPage")
    @Tag("cleanBeauty")
    @Description("Main page Tests for letu.ru")
    @DisplayName("item 'Clean beauty' has link to /browse/clean-beauty")
    void cleanBeautyShouldHasLinkTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Clean beauty' item has link to its page", () -> {
            $(".main-menu-rd-items")
                    .$(withText("Clean beauty"))
                    .shouldHave(attribute("href", "https://www.letu.ru/browse/clean-beauty"));
        });

    }

    @Test
    @Tag("letuMainPage")
    @Tag("exclusive")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Main page has 'Эксклюзив' item in main menu")
    void shouldBeExclusiveInMainMenuTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Эксклюзив' exist in main menu items", () -> {
            $(".main-menu-rd-items").$(withText("Эксклюзив")).shouldBe(exist);
        });

    }

    @Test
    @Disabled("For Allure report")
    @Tag("letuMainPage")
    @Tag("exclusive")
    @Description("Main page Tests for letu.ru")
    @DisplayName("item 'Эксклюзив' has link to /compilations/exclusive")
    void exclusiveShouldHasLinkTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Эксклюзив' item has link to its page", () -> {
            $(".main-menu-rd-items")
                    .$(withText("Эксклюзив"))
                    .shouldHave(attribute("href", "https://www.letu.ru/compilations/exclusive"));
        });

    }

    @Test
    @Deprecated
    @Tag("letuMainPage")
    @Tag("expressDelivery")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Main page has 'Экспресс-доставка' item in main menu")
    void shouldBeExpressDeliveryInMainMenuTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Экспресс-доставка' exist in main menu items", () -> {
            $(".main-menu-rd-items").$(withText("Экспресс-доставка")).shouldBe(exist);
        });

    }

    @Test
    @Tag("letuMainPage")
    @Tag("expressDelivery")
    @Description("Main page Tests for letu.ru")
    @DisplayName("item 'Экспресс-доставка' has link to /compilations/express-delivery")
    void expressDeliveryShouldHasLinkTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Экспресс-доставка' item has link to its page", () -> {
            $(".main-menu-rd-items")
                    .$(withText("Экспресс-доставка"))
                    .shouldHave(attribute("href", "https://www.letu.ru/compilations/express-delivery"));
        });

    }

    @Test
    @Disabled("For Allure report")
    @Tag("letuMainPage")
    @Tag("parfyumeriya")
    @Description("Main page Tests for letu.ru")
    @DisplayName("Main page has 'Парфюмерия' item in main menu")
    void shouldBeParfyumeriyaInMainMenuTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Парфюмерия' exist in main menu items", () -> {
            $(".main-menu-rd-items").$(withText("Парфюмерия")).shouldBe(exist);
        });

    }

    @Test
    @Tag("letuMainPage")
    @Tag("parfyumeriya")
    @Description("Main page Tests for letu.ru")
    @DisplayName("item 'Парфюмерия' has link to /compilations/express-delivery")
    void ParfyumeriyaShouldHasLinkTest() {
        step("open letu.ru", () -> {
            open("https://www.letu.ru/");
        });

        step("'Парфюмерия' item has link to its page", () -> {
            $(".main-menu-rd-items")
                    .$(withText("Парфюмерия"))
                    .shouldHave(attribute("href", "https://www.letu.ru/browse/parfyumeriya"));
        });

    }

}