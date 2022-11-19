package hh;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement mySivi =$x("//a[text()='Мои резюме']");
    private final SelenideElement sivi_1 =$x("//span[text()='QA Engineer (тестировщик программного обеспечения)']");
    private final SelenideElement into = $x("//a[@data-qa=\"login\"]");
    private final SelenideElement into1 = $x("//button[@data-qa=\"expand-login-by-password\"]");
    private final SelenideElement into2 = $x("(//input[@type=\"text\"])[2]");
    private final SelenideElement info3 = $x("//input[@aria-label=\"Введите пароль\"]");
    private final SelenideElement buttonInTo = $x("//span[text()='Войти']");
    public MainPage(String url) {//Главная страница
        Selenide.open(url);
    }
    public void inToResume() {//Выбор резюме
        mySivi.click();
        sivi_1.click();
    }
    public void inTo(){//Переход от главной к авторизации
        into.click();
        into1.click();
    }

    public void setUser(){//Авторизация
        into2.setValue("art822@rambler.ru");
        info3.setValue("vostok1");
        buttonInTo.click();
    }

}
