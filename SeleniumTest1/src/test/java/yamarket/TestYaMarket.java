package yamarket;

import com.codeborne.selenide.Selenide;
import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class TestYaMarket extends BaseTest {
    private final static String URL="https://market.yandex.ru/";

    @Test
    public void marketYaTest(){
        MartketYaMainPage martketYaMainPage = new MartketYaMainPage(URL);
        martketYaMainPage.inCatalog();
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.inCompNout();
        LaptopsComputersPage laptopsComputersPage = new LaptopsComputersPage();
        laptopsComputersPage.inToNout();
        martketYaMainPage.setPrice();
        martketYaMainPage.setLenovo();
        Selenide.sleep(3500);
        martketYaMainPage.hiddenAlso();
        Selenide.sleep(2000);
        martketYaMainPage.getPrices();
        Assert.assertEquals(martketYaMainPage.getPricesListActual() , martketYaMainPage.getPricesListExpected());


        //Selenide.Wait().withTimeout(Duration.of(25 , ChronoUnit.SECONDS));

    }
}
