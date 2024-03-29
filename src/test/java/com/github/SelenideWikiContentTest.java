package com.github;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiContentTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    public void wikiContentTest() {
        String JUnit5CodeExample =  "@ExtendWith({SoftAssertsExtension.class})\n" +
                                    "class Tests {\n" +
                                    "  @Test\n" +
                                    "  void test() {\n" +
                                    "    Configuration.assertionMode = SOFT;\n" +
                                    "    open(\"page.html\");\n" +
                                    "\n" +
                                    "    $(\"#first\").should(visible).click();\n" +
                                    "    $(\"#second\").should(visible).click();\n" +
                                    "  }\n" +
                                    "}";

        open("https://github.com");
        $("button.input-button").click();
        $("input#query-builder-test").setValue("selenide").pressEnter();
        $$("span.search-match").findBy(text("selenide/selenide")).click();
        $("#wiki-tab").click();
        $("button.js-wiki-more-pages-link").click();
        $("div.js-wiki-sidebar-toggle-display").shouldHave(text("SoftAssertions"));
        $("div.js-wiki-sidebar-toggle-display").$(byText("SoftAssertions")).click();
        $("div.markdown-body").$(byText("3. Using JUnit5 extend test class:")).sibling(0).shouldHave(text(JUnit5CodeExample));
    }
}