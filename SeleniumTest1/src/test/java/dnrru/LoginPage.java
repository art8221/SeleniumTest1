package dnrru;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public void enterLogin (){
        Selenide.open("https://dn-r.ru/");
        Selenide.$x("//span[text()=\"Вход\"]").click();
        Selenide.$x("//input[@id=\"login_modal\"]").setValue("art822@rambler.ru");
        Selenide.$x("//input[@id=\"pass_modal\"]").setValue("vostok1");
        Selenide.$x("//input[@id=\"go_modal\"]").click();

    }
    public void setWrongPassword () {
        if (WebDriverRunner.getWebDriver().getCurrentUrl().equals("https://dn-r.ru/"))
        Selenide.open("https://dn-r.ru/");
        Selenide.$x("//span[text()=\"Вход\"]").click();
        Selenide.$x("//input[@id=\"login_modal\"]").setValue("art822@rambler.ru");
        Selenide.$x("//input[@id=\"pass_modal\"]").setValue("vostok2");
        Selenide.$x("//input[@id=\"go_modal\"]").click();
        Assert.assertEquals("Неверный логин/пароль!",
                $x("//div[@class=\"error fr-text-danger\"]").getText());
    }
}
