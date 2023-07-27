package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsEnterpriseTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void hoverAndClick() {
        open("https://github.com");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $("div.border-bottom").$(byText("Enterprise")).click();
        $("div.enterprise-hero h1").shouldHave(text("Build like the best"));
    }
}
