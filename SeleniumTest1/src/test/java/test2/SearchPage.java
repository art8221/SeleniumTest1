package test2;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection elementsCollection = $$x("//h2//a");

    /**
     * Возвращает href из первой статьи
     */
    public String getHrefFromFirstArticle(){
       return elementsCollection.first().getAttribute("href");

    }
}
