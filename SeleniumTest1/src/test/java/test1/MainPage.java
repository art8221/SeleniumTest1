package test1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/*
Главная страница сайта
 */
public class MainPage {//логика взаимодействия с элементами(на страницах) должна происходить в Page классах
    private final SelenideElement textBoxInput = $x("//input[@name='s']");//кликабельный объект ВАЖНО

    public MainPage (String url){
        Selenide.open(url);
    }

    /**
     * выполняется поиск среди статей и нажимается кнопка ENTER
     * @param searchString Поисковая строка запроса
     */
    public void search(String searchString){
        textBoxInput.setValue(searchString);//Передаем, устанавливаем значение
        textBoxInput.sendKeys(Keys.ENTER);//Передаем значение ЕНТЕР в поле
    }

}
