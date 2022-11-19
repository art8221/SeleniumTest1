package test1;

import test1.core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest {//Класс для задачи ЛОГИКИ ПРОВЕРКИ
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13  отличается от iPhone 12";

    @Test//Вся тестовая логика указывается только в тестоввых классах(указание переменных, сравнение..)
    //а логика взаимодействия с элементами(на страницах) должна происходить в Page классах
    public void checkHref (){
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_STRING);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        boolean link = href.contains("iphone-13");//Проверка на наличие строки
        Assert.assertTrue(link);//Метод Junit-а

    }

/* ТЕСТ КЙС
1. Открыть сайт https://appleinsider.ru/ ;
2. Нажать кнопку поиска сверху справа;
3. Ввести текст "Чем iPhone 13  отличается от iPhone 12";
4. В найденных статьях получить href атрибут первой найденной статьи;
5. Убедится что в href ссылка имеет "iphone-13" (орати внимание как это выглядит в href ссылке)
 */

}
