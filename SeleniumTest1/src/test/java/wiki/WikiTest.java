package wiki;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import test1.core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$x;

public class WikiTest extends BaseTest {
    private final static String URL="https://ru.wikipedia.org/wiki/Java";

    @Test
    public void opehAllHrefs(){
        Selenide.open(URL);
        ElementsCollection hrefs = $$x("//div[@id='toc']//a[@href]");
        List<String>links=new ArrayList<>();
        //1
      /* for (int i=0; i<hrefs.size();i++){
            links.add(hrefs.get(i).getAttribute("href"));
        }*/
        //2
       for (SelenideElement element:hrefs){                     //АНАЛОГИ
            links.add(element.getAttribute("href"));
        }
        //3
       // hrefs.forEach(x->links.add(x.getAttribute("href")));

       links.forEach(Selenide::open);
       //links.forEach(x->Selenide.open(x));
        for (int i =0; i<links.size(); i++){
            String listUrl=links.get(i);//Получаю ссылку из элемента списка
            Selenide.open(listUrl);
            String currentUrl= WebDriverRunner.getWebDriver().getCurrentUrl();//Получаю реал. ссылку открытую браузером
            Assert.assertEquals(currentUrl,listUrl);//Сравниваю ссылку из списка и реальнооткрытую браузером
        }
        //В случайном порядке открыть все ссылки(удаляя из списка уже открытые)
        while (links.size()>0){
            int randomNmber = new Random().nextInt(links.size());
            Selenide.open(links.get(randomNmber));
            links.remove(WebDriverRunner.getWebDriver().getCurrentUrl());//Удал из спис элемент по знач(url из браузера)
        }
        //Получаю список с длинной ссылок при помощи стрим АПИ
        List<Integer> LinksLenght = hrefs.stream().map(x->x.getAttribute("href").length()).collect(Collectors.toList());
        int a=0;
    }
}
