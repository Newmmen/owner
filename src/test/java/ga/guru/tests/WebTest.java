package ga.guru.tests;

import com.codeborne.selenide.Condition;
import ga.guru.config.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends TestBase {
    @Test
    public void test() {
        open("https://github.com/");
        $("#user_email").shouldBe(Condition.visible);
    }

}
