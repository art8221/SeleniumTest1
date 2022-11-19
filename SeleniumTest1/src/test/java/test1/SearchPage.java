package test1;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {//логика взаимодействия с элементами(на страницах) должна происходить в Page классах
    private final ElementsCollection elementsCollection = $$x("//h2//a");

    /**
     * Возвращает href из первой статьи!!!
     */
    public String getHrefFromFirstArticle(){
       return elementsCollection.first().getAttribute("href");

    }
}
