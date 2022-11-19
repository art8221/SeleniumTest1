package test2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/*
Главная страница сайта
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage (String url){
        Selenide.open(url);
    }

    /**
     * выполняется поиск среди статей и нажимается кнопка ENTER
     * @param searchString Поисковая строка запроса
     */
    public SearchPage search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }

}
