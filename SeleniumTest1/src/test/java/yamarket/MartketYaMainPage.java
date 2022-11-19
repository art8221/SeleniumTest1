package yamarket;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MartketYaMainPage {
    private final SelenideElement catalog =$x("//div[@data-tid=\"f5f0a469\"]");
    private final ElementsCollection prices = $$x("//div[@class=\"_3NaXx _33ZFz _2m5MZ\"]/span/span[1]");
    private final SelenideElement priceFrom = $x ("(//input[@class=\"_3qxDp\"])[1]");
    private final SelenideElement priceBefore = $x ("(//input[@class=\"_3qxDp\"])[2]");

    private final SelenideElement checkLenovo = $x ("//span[@class=\"_1ZDAA\"][text()='Lenovo']");
    private final SelenideElement hiddenAlso = $x ("//button[@class=\"_2AMPZ _1N_0H _1ghok _390_8\"]/span[@class=\"_36HP6 _3ZjYC\"][text()=\"Показать ещё\"]");

    private List<Integer> pricesListActual = new ArrayList<>();
    private List<Integer> pricesListExpected = new ArrayList<>();

    String sumFrom = "25000";
    String sumBefore = "130000";

    public List<Integer> getPricesListActual(){
        return pricesListActual;
    }
    public List<Integer> getPricesListExpected(){
        return pricesListExpected;
    }


    public MartketYaMainPage(String url) {//Главная страница
        Selenide.open(url);
    }
    public void inCatalog() {//Вход в каталог
        catalog.click();
    }




    public void setPrice(){//выбор цены
        priceFrom.click();
        priceFrom.setValue(sumFrom);
        priceBefore.click();
        priceBefore.setValue(sumBefore);
    }
    public void setLenovo(){//выбор марки Lenovo
        checkLenovo.click();
    }
    public  void getPrices(){
        for (SelenideElement element:prices){
            this.pricesListActual.add(Integer.parseInt(element.getText().replaceAll("\\D+" , "")));//забираю только число

        }

        for (Integer element: pricesListActual){
            if ((element>=(Integer.parseInt(sumFrom))) && (element <=(Integer.parseInt(sumBefore)))){
                this.pricesListExpected.add(element);
            }
        }
    }

    public void hiddenAlso(){
        while (hiddenAlso.isDisplayed()){
            hiddenAlso.click();
            sleep(1500);
            //проверка шут
        }

    }


}
